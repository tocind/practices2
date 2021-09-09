package org.toc.practices2.concurrency.ex12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class OddPrinter {
    private Lock lock;
    private int limit;
    private AtomicInteger counter;
    private Condition condition;
    private static final Logger LOG = LoggerFactory.getLogger(OddPrinter.class);

    OddPrinter(Lock _lock, Condition _condition, int _limit, AtomicInteger _counter){
        lock = _lock;
        condition = _condition;
        limit = _limit;
        counter = _counter;
    }

    public void printOdd() throws InterruptedException{
        LOG.info("Inside OddPrinter-printOdd()");
        lock.lock();
        try{
            while (counter.get() < limit){
                if(counter.get() % 2 == 0){
                    condition.await();
                    Thread.sleep(600);
                }
                LOG.info(Thread.currentThread().getName()+" "+counter.get());
                counter.incrementAndGet();
                condition.signalAll();
            }
        }finally {
            lock.unlock();
        }
    }

}
