package org.example;

public class Dish<T> implements Cookable<T> {
    private final Product[] products;
    private final String name;
    private final Recipe<T> recipe;

    public Dish(Product[] products, String name, Recipe<T> recipe) {
        this.products = products;
        this.name = name;
        this.recipe = recipe;
    }

    public T cook(Recipe<T> recipe) {
        return recipe.cook(products);
    }
}
