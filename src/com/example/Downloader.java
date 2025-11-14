package com.example;
public class Downloader {

    public static void main(String[] args) {

        int totalChunks = 5;  // number of threads/chunks
        Thread[] threads = new Thread[totalChunks];

        // Create and start download threads
        for (int i = 0; i < totalChunks; i++) {
            int chunkId = i + 1;
            threads[i] = new Thread(() -> downloadChunk(chunkId));
            threads[i].start();
        }

        // Main thread waits for all download threads to finish
        for (int i = 0; i < totalChunks; i++) {
            try {
                threads[i].join();   // wait for each chunk to finish downloading
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nDownload complete!");
    }

    // Simulate downloading a chunk (faster download)
    private static void downloadChunk(int chunkId) {
        System.out.println("Chunk " + chunkId + " started downloading...");

        try {
            Thread.sleep(500); // reduced to 0.5–1 second per chunk
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Chunk " + chunkId + " finished downloading.");
    }
}
