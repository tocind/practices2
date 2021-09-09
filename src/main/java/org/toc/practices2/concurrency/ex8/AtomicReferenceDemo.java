package org.toc.practices2.concurrency.ex8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicReferenceDemo {
    public static Counter counter = new Counter();
    public static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        try {
            executorService.submit(() -> {
                executorService.submit(() -> {
                    for (int i = 1; i <= 200; ++i) {
                        counter.incrementCounter();
                    }
                });
                for (int i = 1; i <= 500; ++i) {
                    counter.incrementCounter();
                }
            });
            executorService.awaitTermination(5, TimeUnit.SECONDS);
            executorService.shutdown();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        System.out.println(counter.getCounter());
    }
}