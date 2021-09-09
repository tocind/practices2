package org.toc.practices2.concurrency.ex2;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class ExecutorServiceDemo {
    private static final int NUMBER_OF_THREADS = 10;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        log.info(">>>>>>>>>>>>>>>> Starting the thread now >>>>>>>>>>>>>>>>");

        ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        Future<Double> doubleFuture = executorService.submit(new SquareDoubleCallable(2.2));
        Future<Integer> integerFuture = executorService.submit(new SumIntegerCallable(4));
        log.info("SumIntegerCallable has returned {}", doubleFuture.get());
        log.info("SquareDoubleCallable has returned {}", integerFuture.get());

        log.info("calling shutdown");
        executorService.shutdown();
    }
}
