package org.example;

import java.util.List;

public class Recipe<T> {
    private final List<Step<T>> steps;

    public Recipe(List<Step<T>> steps) {
        this.steps = steps;
    }

    public T cook(Product... products) {
        T result = null;
        for (Step<T> step : steps ) {
            result = step.make(result, products);
        }
        return result;
    }
}
