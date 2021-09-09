package org.toc.practices2.Functional;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.function.Supplier;

@Slf4j
public class SupplierDemo {

    public static void main(String[] args) {
        log.info("Testing the supplier");
        Supplier<Integer> supplier = () -> 10;
    }

    private static void supplierTest(Supplier<Integer> integerSupplier, List<Integer> integerList) {

        for(Integer i : integerList){

        }

    }
}
