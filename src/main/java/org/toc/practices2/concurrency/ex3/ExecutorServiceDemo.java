package org.toc.practices2.concurrency.ex3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    private static final int tnum = 10;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(tnum);
        Future<Integer> futureInteger=executor.submit(new MyRunnable(), 1);
        System.out.println("futureInteger.get() > "+futureInteger.get());

        Future<?> future=executor.submit(new MyRunnable());
        System.out.println("future.get() > "+future.get());
        executor.shutdown();
    }
}
