package org.toc.practices2.concurrency.ex11;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddPrinterWaitNotify {
    private static int limit = 100;
    private static AtomicInteger counter = new AtomicInteger(1);
    private static Object lock = new Object();

    public static void main(String[] args) {
        EvenPrinter evenPrinter = new EvenPrinter(limit, counter, lock);
        OddPrinter oddPrinter = new OddPrinter(limit, counter, lock);

        new Thread(() -> {
            try {
                evenPrinter.printEven();
            } catch (InterruptedException iex) {
            }
        }, "even-printer").start();
        new Thread(() -> {
            try {
                oddPrinter.printOdd();
            } catch (InterruptedException iex) {
            }
        }, "odd-printer").start();

    }
}
