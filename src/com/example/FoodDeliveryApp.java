package com.example;
public class FoodDeliveryApp {

    private static final String[] DELIVERY_STATUS = {
            "Order Received", "Preparing Food", "Food Ready", 
            "Out for Delivery", "Nearby", "Delivered"
    };
    
    private static int statusIndex = 0;
    private static int estimatedTime = 30;  // estimated delivery time in minutes
    private static final Object lock = new Object(); // lock to synchronize shared resources

    public static void main(String[] args) {

        // Thread 1: Updates delivery status every 5 seconds
        Thread statusThread = new Thread(() -> {
            while (statusIndex < DELIVERY_STATUS.length - 1) {
                try {
                    Thread.sleep(5000); // update status every 5 seconds
                    synchronized (lock) {
                        statusIndex++;
                        System.out.println("[STATUS UPDATE] " + DELIVERY_STATUS[statusIndex]);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2: Updates ETA every 3 seconds
        Thread etaThread = new Thread(() -> {
            while (statusIndex < DELIVERY_STATUS.length - 1) {
                try {
                    Thread.sleep(3000); // print ETA every 3 seconds
                    synchronized (lock) {
                        if (estimatedTime > 0) {
                            estimatedTime -= (int)(Math.random() * 3) + 1; // reduce ETA randomly by 1-3 minutes
                        }
                        System.out.println("[ETA] Estimated delivery time: " + Math.max(estimatedTime, 0) + " minutes");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        statusThread.start();
        etaThread.start();

        try {
            // Wait for both threads to complete
            statusThread.join();
            etaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nOrder fully delivered!");
    }
}
