package org.example;

public interface Cookable<T> {
    T cook(Recipe<T> recipe);
}
