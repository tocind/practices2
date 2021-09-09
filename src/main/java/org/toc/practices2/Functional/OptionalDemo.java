package org.toc.practices2.Functional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Integer a = null;
        Integer b = new Integer(10);
        Optional<Integer> b1 = Optional.ofNullable(a);
        Optional<Integer> b2 = Optional.of(b);
        sum(b1, b2);
    }

    private static void sum(Optional<Integer> b1, Optional<Integer> b2) {
        System.out.println(b1);
        System.out.println(b2);
    }
}
