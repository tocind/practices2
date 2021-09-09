package org.toc.practices2.concurrency.ex;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadRunnableDemo {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                printEven(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ).start();
    }

    private static void printEven(int j) throws InterruptedException {
        for(int i = 1; i <= j; ++i){
            Thread.sleep(500);
            if(i %2 == 0)
                System.out.println(i);
        }
    }

}
