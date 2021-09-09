package org.toc.practices2.concurrency.ex12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenPrinterReentrantLock {
    private static Lock lock = new ReentrantLock(true);
    private static Condition condition = lock.newCondition();
    private static int limit = 100;
    private static AtomicInteger counter = new AtomicInteger(1);
    private static final Logger LOG = LoggerFactory.getLogger(OddEvenPrinterReentrantLock.class);

    public static void main(String[] args) {
        OddPrinter oddPrinter = new OddPrinter(lock, condition, limit, counter);
        EvenPrinter evenPrinter = new EvenPrinter(lock, condition, limit, counter);
        LOG.info("Starting Threads.");

        new Thread(() -> {
            try {
                oddPrinter.printOdd();
            } catch (InterruptedException iex) {
            }
        }, "oddPrinter").start();

        new Thread(() -> {
            try {
                evenPrinter.printEven();
            } catch (InterruptedException iex) {
            }
        }, "evenPrinter").start();

    }
}
