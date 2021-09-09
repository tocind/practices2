package org.toc.practices2.concurrency.ex4;

import java.util.concurrent.CountDownLatch;

public class TheRunnable implements Runnable {

    CountDownLatch countDownLatch;

    public TheRunnable(CountDownLatch _countDownLatch) {
        countDownLatch = _countDownLatch;
    }

    public void run() {
        for (int i = 3; i >= 1; --i) {
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException iex) {
            }
        }
    }
}
