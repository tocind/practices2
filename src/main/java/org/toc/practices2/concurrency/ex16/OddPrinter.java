package org.toc.practices2.concurrency.ex16;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OddPrinter implements Runnable {

    private int sharedVariable;

    @Override
    public void run() {
        printOdd();
    }

    private void printOdd(){
        log.info("This is {}", Thread.currentThread().getName());
    }
}
