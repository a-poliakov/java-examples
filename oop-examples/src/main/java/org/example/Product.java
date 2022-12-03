package org.example;

public abstract class Product {
    protected String name;
    protected double weight;

    public Product(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
