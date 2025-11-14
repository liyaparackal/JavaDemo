package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StockMarketSimulation {

    // Shared data structure for stock prices
    private static final Map<String, Double> stockPrices = new HashMap<>();
    private static final Random random = new Random();
    private static final ExecutorService executorService = Executors.newFixedThreadPool(4); // Pool size

    // Limit for the number of updates
    private static final int MAX_UPDATES = 5;
    private static int updatesLeft = MAX_UPDATES;

    public static void main(String[] args) {

        // Initialize stocks
        stockPrices.put("AAPL", 150.0);
        stockPrices.put("GOOGL", 2700.0);
        stockPrices.put("TSLA", 700.0);
        stockPrices.put("AMZN", 3300.0);

        // Create and submit threads for each stock
        for (String stock : stockPrices.keySet()) {
            executorService.submit(() -> updateStockPrice(stock));
        }

        // Main thread: display stock prices a limited number of times
        while (updatesLeft > 0) {
            try {
                Thread.sleep(2000); // update display every 2 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (stockPrices) {
                System.out.println("\n=== CURRENT STOCK PRICES ===");
                for (Map.Entry<String, Double> entry : stockPrices.entrySet()) {
                    System.out.printf("%s : $%.2f%n", entry.getKey(), entry.getValue());
                }
            }

            updatesLeft--; // Decrease the update count
        }

        // Shutdown the executor after main loop ends
        executorService.shutdown();

        System.out.println("\nSimulation complete!");
    }

    // Thread task: update a single stock's price every few seconds
    private static void updateStockPrice(String stock) {
        while (updatesLeft > 0) { // Keep updating while there are updates left
            try {
                Thread.sleep(1500 + random.nextInt(2000));  // 1.5–3.5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (stockPrices) {
                double oldPrice = stockPrices.get(stock);

                // Random % change between -2% and +2%
                double changePercent = (random.nextDouble() * 4 - 2) / 100.0;
                double newPrice = oldPrice + (oldPrice * changePercent);

                stockPrices.put(stock, newPrice);
            }
        }
    }
}
