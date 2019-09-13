package com.github.sirlacky.DesignPatternsCheatSheet.Builder;

//BASIC CLASS CONTAINING INNER BUILDER CLASS (CAN BE OUTTER AS WELL)
public class Drink {
    private String name;
    private int volume;
    private double price;

    //No setters, private modified constructor:
    private Drink(Builder builder) {  //no fields in arguments, only Builder object
        this.name = builder.name;     //reference to builder fields
        this.volume = builder.volume;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    //INNER BUILDER CLASS
    public static class Builder {
        private final String name;
        private int volume;
        private double price;

        //Empty constructor, or with final fields if we want;
        public Builder(final String name) {
            this.name = name;
        }

        //Methods to every field not given by constructor (see above)
        public Builder volume(final int volume) {
            this.volume = volume;
            return this;
        }

        public Builder price(final double price) {
            this.price = price;
            return this;
        }

        //Method build finishing building object.
        public Drink build() {
            return new Drink(this);
        }
    }
}
