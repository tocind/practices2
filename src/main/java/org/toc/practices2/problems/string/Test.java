package org.toc.practices2.problems.string;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.PriorityQueue;

@Slf4j
public class Test {

    public static void main(String... args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        priorityQueue.add(7);
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(3);


        log.info("the size of the queue {}", priorityQueue.size());
        for (Integer e : priorityQueue)
            log.info("the element : {}", e);

    }

    public static void main2(String[] args) {
        int[] array = {25, 21, 22, 17, 10, 53, 19, 12};

        sortFunction(array);
        printArray(array);
    }

    private static void sortFunction(int[] array) { // sorts the array
        for (int i = 0; i < array.length - 1; ++i) {
            int index = findSmallest(array, i);
            log.info("The smallest element index {}", index);
            swap(index, i, array);
        }
    }

    private static int findSmallest(int[] array, int startIndex) { // gets the smallest element from the array
        int temp = Integer.MAX_VALUE;
        int smallIndex = -1;
        for (int i = startIndex; i < array.length; ++i) {
            if (array[i] < temp) {
                temp = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    private static void swap(int index, int i, int[] array) {
        int temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }

    private static void printArray(int[] array) {
        System.out.println("\n-------------------\n");
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
    }
}
