package org.toc.practices2.concurrency.ex10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Semaphore;

public class Task {
    Semaphore semaphore;
    private static final Logger LOGGER = LoggerFactory.getLogger(Task.class);

    public Task(Semaphore _semaphore) {
        this.semaphore = _semaphore;
    }

    public void printTask() throws InterruptedException {
        semaphore.acquire();
        for (int i = 1; i <= 20; ++i) {
            System.out.println(Thread.currentThread().getName()+" "+ i);
            Thread.sleep(800);
        }
        semaphore.release();
    }

}
