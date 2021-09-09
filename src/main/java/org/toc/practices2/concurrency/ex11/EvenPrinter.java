package org.toc.practices2.concurrency.ex11;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenPrinter {
    private int limit;
    private AtomicInteger counter;
    private Object lock;

    EvenPrinter(int _limit, AtomicInteger _counter, Object _lock) {
        limit = _limit;
        counter = _counter;
        lock = _lock;
    }

    public void printEven() throws InterruptedException {
        synchronized (lock) {
            while (counter.get() < limit) {
                if (counter.get() % 2 != 0) {
                    lock.wait();
                    Thread.sleep(600);
                }
                System.out.println(Thread.currentThread().getName() + " " + counter.get());
                counter.incrementAndGet();
                lock.notifyAll();
            }
        }
    }
}
