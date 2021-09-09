package org.toc.practices2.concurrency.ex14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenPrinterSemaphore {
    private static int limit = 100;
    private static AtomicInteger counter = new AtomicInteger(1);
    private static Semaphore oddSemaphore = new Semaphore(1);
    private static Semaphore evenSemaphore = new Semaphore(0);
    private static final Logger LOG = LoggerFactory.getLogger("OddEvenPrinter");

    public static void main(String[] args) {
        OddPrinter oddPrinter = new OddPrinter(limit, counter, oddSemaphore, evenSemaphore);
        EvenPrinter evenPrinter = new EvenPrinter(limit, counter, oddSemaphore, evenSemaphore);

        new Thread(() -> {
            try {
                oddPrinter.printOdd();
            } catch (InterruptedException ex) {
            }
        }, "odd-printer").start();
        new Thread(() -> {
            try {
                evenPrinter.printEven();
            } catch (InterruptedException ex) {
            }
        }, "even-printer").start();

        new Thread(() -> {
            try{
                oddPrinter.printOdd();
            }catch(Exception ex){
                LOG.info("Runtime exception");
            }
        }).start();

    }
}
