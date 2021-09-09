package org.toc.practices2.concurrency.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    static int nthread = 2;
    static int ntask = 10;
    // two threads  will be used at a time for the execution of ten tasks
    public static void main(String... args) {
        ExecutorService executorService = Executors.newFixedThreadPool(nthread);

        for(int i = 1; i <= ntask; ++i){
            executorService.execute(new RunnableImpl(i));
        }
        executorService.shutdown();
    }
}
