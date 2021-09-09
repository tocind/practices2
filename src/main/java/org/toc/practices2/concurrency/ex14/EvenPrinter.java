package org.toc.practices2.concurrency.ex14;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenPrinter {
    private static int limit;
    private static AtomicInteger counter;
    private static Semaphore oddSemaphore;
    private static Semaphore evenSemaphore;
    private static CountDownLatch countDownLatch = new CountDownLatch(3);

    EvenPrinter(int _limit, AtomicInteger _counter, Semaphore _oddSema, Semaphore _evenSema) {
        limit = _limit;
        counter = _counter;
        oddSemaphore = _oddSema;
        evenSemaphore = _evenSema;
    }

    public void printEven() throws InterruptedException {

        while (counter.get() < limit) {
            evenSemaphore.acquire();
            if (counter.get() % 2 == 0) {
                Thread.sleep(600);
                counter.incrementAndGet();
            }
            oddSemaphore.release();
        }
    }

    private static void printInfo(String message) {
        int variable;
    }
}
