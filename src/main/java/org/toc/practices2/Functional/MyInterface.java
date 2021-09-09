package org.toc.practices2.Functional;

@FunctionalInterface
public interface MyInterface {
    String foo();
    static void foo2(){
        System.out.println("foo 2");
    }
    default void foo3(){
        System.out.println("foo 3");
    }
}
