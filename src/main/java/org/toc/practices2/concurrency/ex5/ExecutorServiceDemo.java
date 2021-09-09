package org.toc.practices2.concurrency.ex5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    private static int NO_OF_THREADS = 3;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(NO_OF_THREADS);
        ExecutorCompletionService e = new ExecutorCompletionService(executorService);
        CountDownLatch countDownLatch = new CountDownLatch(3);

        for (int i = 1; i <= 3; ++i) {
            executorService.execute(new TheRunnable(countDownLatch));
        }
        countDownLatch.await();
        executorService.shutdown();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
