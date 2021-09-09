package org.toc.practices2.multithreading;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
class Producer implements Runnable {
    ArrayList<Integer> queue;
    int val;

    Producer() {
        queue = new ArrayList<Integer>();
    }

    @Override
    public void run() {
    }

    private int produce(){
        return val;
    }
}

@Slf4j
class Consumer implements Runnable {

    @Override
    public void run() {

    }
}

@Slf4j
public class TestClass {
    public static void main(String[] args) throws InterruptedException {

        Producer producer = new Producer();
        Consumer consumer = new Consumer();



    }
}
