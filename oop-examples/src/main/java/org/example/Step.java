package org.example;

public interface Step<T> {
    T make(T result, Product... products);
}
