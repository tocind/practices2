package org.toc.practices2.concurrency.ex5;

import java.util.concurrent.CountDownLatch;

public class TheRunnable implements Runnable {

    CountDownLatch countDownLatch;
    public TheRunnable(CountDownLatch _countDownLatch) {
        countDownLatch = _countDownLatch;
    }

    public void run() {
        countDownLatch.countDown();
        System.out.println("--->"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException iex){
        }
    }
}
