package org.toc.practices2.concurrency.ex;

public class ThreadRunnableDemo2 {

    int limit = 100;
    int counter = 1;
    Object object = new Object();

    Thread t1 = new Thread(() -> {
        synchronized (object) {
            while (counter < limit) {
                if (counter % 2 != 0) {
                    try {
                        object.wait();
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println(Thread.currentThread().getName() + " ===> " + counter++);
                object.notify();
            }
        }
    }, "evenPrinter");

    Thread t2 = new Thread(() -> {
        synchronized (object) {
            while (counter < limit) {
                if (counter % 2 == 0) {
                    try {
                        object.wait();
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println(Thread.currentThread().getName() + " ===> " + counter++);
                object.notify();
            }
        }
    }, "oddPrinter");

    public static void main(String[] args) throws InterruptedException {
        
        ThreadRunnableDemo2 trd = new ThreadRunnableDemo2();
        trd.t1.start();
        trd.t2.start();

    }
}
