//SYNCHRONISATION 2.2
package com.example;
import java.io.*;

class LogWriter {

    // Static synchronized method -> lock is on LogWriter.class
    public static synchronized void writeLog(String msg) {
        System.out.println(Thread.currentThread().getName() + " writing...");

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("log.txt", true))) {
            oos.writeObject(msg);

            // Just to show locking effect
            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName() + " done.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Two threads, each calling writeLog()
        Thread t1 = new Thread(() -> LogWriter.writeLog("Log entry from Thread 1"));
        Thread t2 = new Thread(() -> LogWriter.writeLog("Log entry from Thread 2"));

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
