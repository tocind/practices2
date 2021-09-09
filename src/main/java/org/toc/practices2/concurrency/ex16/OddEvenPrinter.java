package org.toc.practices2.concurrency.ex16;

public class OddEvenPrinter {

    public static void main(String[] args) {

        EvenPrinter even = new EvenPrinter();
        OddPrinter odd= new OddPrinter();

        Thread evenThread = new Thread(even);
        Thread oddThread = new Thread(odd);

        evenThread.start();
        oddThread.start();

    }
}
