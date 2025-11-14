//SYNCHRONISATION 2.1
package com.example;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ClinicConfig implements Serializable {

    // Static configuration fields
    static String hospitalName = "City Health Center";
    static String location = "Downtown";

    // Static synchronized method (lock is on ClinicConfig.class)
    public static synchronized void saveConfig() {
        System.out.println(Thread.currentThread().getName() + " entered saveConfig()");

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("clinic_config.ser"))) {

            // Writing static fields manually (static fields are not automatically serialized)
            oos.writeObject(hospitalName);
            oos.writeObject(location);

            System.out.println(Thread.currentThread().getName() + " saved configuration.");

            // Simulate long-running operation
            Thread.sleep(2000);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " exiting saveConfig()");
    }

    // ConfigSaverThread class that runs the saveConfig method
    static class ConfigSaverThread extends Thread {
        @Override
        public void run() {
            ClinicConfig.saveConfig();
        }
    }

    // Main method to test the synchronization of the saveConfig method
    public static void main(String[] args) {

        // Create two threads that will both try to call saveConfig()
        Thread t1 = new ConfigSaverThread();
        Thread t2 = new ConfigSaverThread();

        // Set names for the threads to track which one is executing
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Start both threads
        t1.start();
        t2.start();
    }
}
