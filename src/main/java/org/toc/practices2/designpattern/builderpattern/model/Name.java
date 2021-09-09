package org.toc.practices2.designpattern.builderpattern.model;

import java.util.List;

public class Name {
    private final String firstName;
    private final String lastName;
    private final List<String> middleNames;

    Name(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleNames = builder.middleNames;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private List<String> middleNames;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder middleNames(List<String> middleNames) {
            this.middleNames = middleNames;
            return this;
        }

        public Name build() {
            return new Name(this);
        }
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleNames=" + middleNames +
                '}';
    }
}
