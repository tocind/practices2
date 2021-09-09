package org.toc.practices2.problems.heap;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class BinaryHeapProblem1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(e -> e)); // min heap
        getData(priorityQueue);
        priorityQueue.stream().forEach(System.out::println);
        System.out.println("\n\n\n");
        // Logic for heap sort
        List<Integer> list = new ArrayList<>();
        int size = priorityQueue.size();
        for (int i = 0; i < size; ++i)
            list.add(priorityQueue.poll());

        list.stream().forEach(System.out::print);
        HashMap<String, String> map = new HashMap<>();

    }

    private static void getData(PriorityQueue<Integer> priorityQueue) {

        priorityQueue.add(10);
        priorityQueue.add(15);
        priorityQueue.add(8);
        priorityQueue.add(7);
        priorityQueue.add(12);
        priorityQueue.add(22);
        priorityQueue.add(9);

    }
}
