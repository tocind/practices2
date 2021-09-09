package org.toc.practices2.problems.string;
// Minimum swaps required to bring all elements less than or equal to k together
public class MinimumSwaps {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 6};
        
        findMinSwap(array, array.length, 6);
    }

    private static void findMinSwap(int[] array, int len, int k) {
        int count = 0;
        int tempCount = 0;
        int idx = -1;

        for(int i = 0; i < len; ++i) {
            if(array[i] <= 6){
                ++count;
            }
            else {
                idx = i;
                if(tempCount < count){
                    tempCount = count;
                    count = 0;
                }
            }
        }

        System.out.println(tempCount+" "+idx);
    }
}
