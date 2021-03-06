package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;
    static private final List<String> KINDS_OF_ROLLS = new ArrayList<String>(){{
        add("plain");
        add("with sesame");
    }};
    static private final List<String> KINDS_OF_SAUCE = new ArrayList<String>(){{
        add("standard");
        add("1000 islands");
        add("barbecue");
    }};
    static private final List<String> KINDS_OF_INGREDIENTS = new ArrayList<String>(){{
        add("lettuce");
        add("onion");
        add("bacon");
        add("pickle");
        add("chilli pepper");
        add("mushrooms");
        add("shrimps");
        add("cheese");
    }};

    private Bigmac(final String roll, final int burgers, final String sauce, final List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();


        public BigmacBuilder roll(String roll) {
            if (KINDS_OF_ROLLS.contains(roll)) {
                this.roll = roll;
            } else {
                throw new IllegalArgumentException("We don't have such kind of roll");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (KINDS_OF_SAUCE.contains(sauce)) {
                this.sauce = sauce;
            } else {
                throw new IllegalArgumentException("We don't have such kind of sauce");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (KINDS_OF_INGREDIENTS.contains(ingredient)) {
                ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
