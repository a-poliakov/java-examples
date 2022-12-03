package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product potato = new Potato("free", 100.0);
        Step<FreePotato> step1 = new Step<FreePotato>() {
            @Override
            public FreePotato make(FreePotato result, Product... products) {
                return new FreePotato(products, "free potato", null, true);
            }
        };
        Recipe<FreePotato> recipe = new Recipe<>(Arrays.asList(step1));
        FreePotato dish = new FreePotato(new Product[]{potato}, "free potato", recipe, false);
        Dinner dinner = new Dinner(new Dish[]{dish});
    }
}
