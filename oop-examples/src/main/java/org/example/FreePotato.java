package org.example;

public class FreePotato extends Dish<FreePotato> {
    private final Boolean isReady;

    public FreePotato(Product[] products, String name, Recipe<FreePotato> recipe, Boolean isReady) {
        super(products, name, recipe);
        this.isReady = isReady;
    }
}
