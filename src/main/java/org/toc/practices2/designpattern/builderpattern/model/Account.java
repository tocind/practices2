package org.toc.practices2.designpattern.builderpattern.model;

public class Account {

    private final Name name;
    private final Address address;
    private final int id;
    private final String email;

    Account(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.id = builder.id;
        this.email = builder.email;
    }

    public static class Builder {
        private Name name;
        private Address address;
        private int id;
        private String email;

        public Builder name(Name name) {
            this.name = name;
            return this;
        }
        public Builder address(Address address) {
            this.address = address;
            return this;
        }
        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Account build() {
            return new Account(this);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name=" + name +
                ", address=" + address +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
