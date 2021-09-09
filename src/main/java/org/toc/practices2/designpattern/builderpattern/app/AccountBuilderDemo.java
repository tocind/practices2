package org.toc.practices2.designpattern.builderpattern.app;

import org.toc.practices2.designpattern.builderpattern.model.Account;
import org.toc.practices2.designpattern.builderpattern.model.Address;
import org.toc.practices2.designpattern.builderpattern.model.Name;

import java.util.Arrays;
import java.util.Collections;

public class AccountBuilderDemo {
    public static void main(String[] args) {
        Name name = new Name.Builder()
                .firstName("FIST_NAME")
                .lastName("LAST_NAME")
                .middleNames(Collections.unmodifiableList(Arrays.asList("MIDNAME1", "MIDNAME2", "MIDNAME3")))
                .build();

        Address address = new Address.Builder()
                .houseNumber(111)
                .street("STREET1")
                .city("CITY1")
                .zipCode("ZIPCODE1")
                .build();

        Account account = new Account.Builder()
                .name(name)
                .address(address)
                .email("EMAILADDRESS")
                .id(1)
                .build();

        System.out.println(account);



    }
}
