package org.toc.practices2.concurrency.ex2;

import java.util.concurrent.Callable;

public class SumIntegerCallable implements Callable<Integer> {
    int n;

    SumIntegerCallable(int _n) {
        n = _n;
    }

    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        return sum;
    }
}
