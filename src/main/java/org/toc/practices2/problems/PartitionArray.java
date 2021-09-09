package org.toc.practices2.problems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PartitionArray {
    public static void main(String[] args) {
        int[] array = {13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11};
        partition(array);
        printArray(array);
    }

    private static void partition(int[] array) {
        int i = -1;
        int k = array.length - 1;
        for (int j = 0; j <= k - 1; ++j) {
            if (array[j] < array[k]) {
                ++i;
                swap(i, j, array);
            }
        }
        swap(i = 1, k, array);
        log.info("value of i {}", i);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
