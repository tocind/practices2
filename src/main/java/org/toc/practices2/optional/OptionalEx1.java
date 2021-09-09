package org.toc.practices2.optional;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        log.info("This is an optional object {}", optional);

        String book = null;
        if(book != null){
            log.info(book.toUpperCase());
        }

        optional = Optional.ofNullable(book);
        if(optional.isPresent()){
            log.info("How are you doing?");
        }
    }
}
