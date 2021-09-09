package org.toc.practices2.concurrency.ex16;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EvenPrinter implements Runnable {

    private int sharedVariable;

    @Override
    public void run() {
        printEven();
    }

    private void printEven() {
        log.info("This is {}", Thread.currentThread().getName());
    }
}
