package org.toc.practices2.problems.heap;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class BinaryHeapProblem2 {
    // Merge k sorted array

    public static void main(String[] args) {
        int[] a = {2, 9, 23, 55};
        int[] b = {4, 5, 8, 25};
        int[] c = {1, 7, 12, 19};
        int[] d = {14, 16, 20, 43};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparing(e -> e));

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        map.put("b", 0);
        map.put("c", 0);
        map.put("d", 0);
        while(!minHeap.isEmpty()){

        }

        getMin();
        map.put("a", 0);

    }

    private static int getMin(){
        return -1;
    }

    private static void getArrays() {


    }

}
