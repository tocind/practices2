package org.toc.practices2.designpattern.builderpattern.model;

public class Address {
    private final int houseNumber;
    private final String city;
    private final String street;
    private final String zipCode;

    Address(Builder builder) {
        this.houseNumber = builder.houseNumber;
        this.city = builder.city;
        this.street = builder.street;
        this.zipCode = builder.zipCode;
    }

    public static class Builder {
        private int houseNumber;
        private String city;
        private String street;
        private String zipCode;

        public Builder houseNumber(int houseNumber){
            this.houseNumber = houseNumber;
            return this;
        }
        public Builder city(String city){
            this.city = city;
            return this;
        }
        public Builder street(String street){
            this.street = street;
            return this;
        }
        public Builder zipCode(String zipCode){
            this.zipCode = zipCode;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
