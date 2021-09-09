package org.toc.practices2.Functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer consumer = (i) -> System.out.println(i);

        List<Integer> integerList = Arrays.asList(
                new Integer(1),
                new Integer(10),
                new Integer(200),
                new Integer(101),
                new Integer(-10),
                new Integer(0)
        );
        printList(integerList, consumer);
    }

    private static void printList(List<Integer> list, Consumer<Integer> consumer) {
        for (Integer integer : list) {
            consumer.accept(integer);
        }
    }
}
//https://www.youtube.com/watch?v=--Q4qcpcBDo