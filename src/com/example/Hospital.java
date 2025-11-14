//SYNCHRONISATION 2.3
package com.example;
import java.io.*;

class HospitalStats {

    static int patientCount = 0;

    // Static synchronized ensures only ONE thread can run this at a time
    public static synchronized void saveStats() {

        System.out.println(Thread.currentThread().getName() +
                " saving stats: patientCount = " + patientCount);

        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("stats.ser"))) {

            oos.writeInt(patientCount);

            // Delay to show thread locking clearly
            Thread.sleep(800);

            System.out.println(Thread.currentThread().getName() + " finished saving.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Hospital {

    public static void main(String[] args) {

        // Thread task: increase count + save
        Runnable task = () -> {
            // Increase global patient count
            synchronized (HospitalStats.class) {
                HospitalStats.patientCount++;
            }
            HospitalStats.saveStats();
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

