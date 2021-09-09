package org.toc.practices2.concurrency.ex4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    private static final int NUMBER_OF_THREADS = 4;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        CountDownLatch countDownLatch = new CountDownLatch(3);

        for (int i = 1; i <= NUMBER_OF_THREADS - 1; ++i) {
            executorService.execute(new TheRunnable(countDownLatch));
        }
        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException ex) {
        }
        System.out.println("Resuming Main Thread");
    }

}
