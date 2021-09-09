package org.toc.practices2.concurrency.ex13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class OddPrinter {
    private static int limit;
    private static AtomicInteger counter;
    private static Semaphore oddSemaphore;
    private static Semaphore evenSemaphore;
    private static final Logger LOG = LoggerFactory.getLogger("OddPrinter");

    OddPrinter(int _limit, AtomicInteger _counter, Semaphore _oddSema, Semaphore _evenSema) {
        limit = _limit;
        counter = _counter;
        oddSemaphore = _oddSema;
        evenSemaphore = _evenSema;
    }

    public void printOdd() throws InterruptedException {
        LOG.info("OddPrinter-> printOdd()");
        oddSemaphore.acquire();
        LOG.info("OddPrinter-> acquired : " + oddSemaphore.availablePermits());
        while (counter.get() < limit) {
            if (counter.get() % 2 == 0)
                evenSemaphore.release();

            Thread.sleep(1000);
            LOG.info(Thread.currentThread().getName() + " " + counter.get());
            counter.incrementAndGet();
            oddSemaphore.release();
        }
        oddSemaphore.release();
    }

}
