package org.toc.practices2.collection.ex;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> res = fun1();
        for(Integer i : res){
            System.out.println(i);
        }
    }

    private static List<Integer> fun1(){
        List<Integer> res = fun2();
        for (Integer i : res){
            System.out.println(i);
        }
        System.out.println();
        res.add(111);
        return res;
    }

    private static List<Integer> fun2(){
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(6);
        integers.add(11);
        integers.add(5);
        integers.add(4);
        return integers;
    }
}
