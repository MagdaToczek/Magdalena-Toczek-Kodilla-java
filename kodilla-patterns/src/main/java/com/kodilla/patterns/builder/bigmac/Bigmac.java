package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

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
            if (roll.equals("plain") || roll.equals("with sesame")) {
                this.roll = roll;
            } else {
                throw new IllegalStateException("We don't have such kind of roll");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals("standard") || sauce.equals("1000 islands") || sauce.equals("barbecue")) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("We don't have such kind of sauce");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals("lettuce") || ingredient.equals("onion") || ingredient.equals("bacon") || ingredient.equals("pickle") || ingredient.equals("chilli pepper") || ingredient.equals("mushrooms") || ingredient.equals("shrimp") || ingredient.equals("cheese")) {
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
