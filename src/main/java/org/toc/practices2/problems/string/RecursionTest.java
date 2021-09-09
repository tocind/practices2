package org.toc.practices2.problems.string;

public class RecursionTest {
    public static void main(String[] args) {
        foo(1);
    }

    private static void foo(int i){
        if(i == 6)
            return;
        System.out.print(i+" ");
        foo(i++);
        System.out.print((i-1)+" ");
    }
}
//1 2 3 4 5 6 7 8 9 10