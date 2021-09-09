package org.toc.practices2.concurrency.ex12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class EvenPrinter {
    private Lock lock;
    private int limit;
    private AtomicInteger counter;
    private Condition condition;
    private static final Logger LOG = LoggerFactory.getLogger(EvenPrinter.class);

    EvenPrinter(Lock _lock, Condition _condition, int _limit, AtomicInteger _counter){
        lock = _lock;
        condition = _condition;
        limit = _limit;
        counter = _counter;
    }


    public void printEven() throws InterruptedException{
        LOG.info("Inside EvenPrinter-printEven()");
        lock.lock();
        try{
            while (counter.get() < limit){
                if(counter.get() % 2 != 0){
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
