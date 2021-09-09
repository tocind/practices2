package org.toc.practices2.Functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = (i) -> i >= 5;

        List<Integer> list = Arrays.asList(
                new Integer(3),
                new Integer(10),
                new Integer(31),
                new Integer(2),
                new Integer(5),
                new Integer(1)
        );
        List<Integer> list1 = findInts(list, p);
        System.out.println(list1);
    }

    private static List<Integer> findInts(List<Integer> l, Predicate<Integer> p) {
        List<Integer> list = new ArrayList<>();
        l.stream().forEach(i -> {
            if (p.test(i)) {
                list.add(i);
            }
        });

        return list;
    }
}
