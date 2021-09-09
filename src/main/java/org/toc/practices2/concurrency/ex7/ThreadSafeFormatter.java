package org.toc.practices2.concurrency.ex7;

import java.text.SimpleDateFormat;

public class ThreadSafeFormatter {

    public static ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(()->
            new SimpleDateFormat("dd-mm-yyyy")
    );
}
