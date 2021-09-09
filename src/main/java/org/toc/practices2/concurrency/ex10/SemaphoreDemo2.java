package org.toc.practices2.concurrency.ex10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(SemaphoreDemo2.class);

    public static void main(String[] args) {
        LOGGER.info("SemaphoreDemo2-App");
        Semaphore semaphore = new Semaphore(1);
        Task task = new Task(semaphore);
        Thread t = new Thread(() -> {
            try {
                task.printTask();
            } catch (InterruptedException iex) {
            }
        });
        t.start();
        Thread t2 = new Thread(() -> {
            try{
                task.printTask();
            }catch (InterruptedException iex){
            }
        });
        t2.start();
    }
}
