package org.toc.practices2.concurrency.ex9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SemaphoreDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(SemaphoreDemo.class);
    public static void main(String[] args) {
        LOGGER.info("Control inside Semaphore Demo");
        ExecutorService executorService = null;
        try{
            executorService = Executors.newCachedThreadPool();
            for (int i = 1; i <= 300; ++i){
                executorService.submit(() -> Connection.getConnection().connect());
            }
        }catch (Exception iex){
        }finally {
            if(executorService != null)
                executorService.shutdown();
        }
    }
}
