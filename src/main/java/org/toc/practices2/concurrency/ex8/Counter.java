package org.toc.practices2.concurrency.ex8;

public class Counter {
    /*volatile*/ int counter;
    public int getCounter(){
        return counter;
    }
    public synchronized void incrementCounter(){
        counter++;
    }

}
