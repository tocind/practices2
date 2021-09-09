package org.toc.practices2.concurrency.ex2;

import java.util.concurrent.Callable;

public class SquareDoubleCallable implements Callable<Double> {
    Double n;

    SquareDoubleCallable(Double _n){
        n = _n;
    }
    public Double call() throws Exception {
        return n * n;
    }
}
