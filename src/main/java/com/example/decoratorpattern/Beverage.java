package com.example.decoratorpattern;

public abstract class Beverage {

    String description = "";

    public String getDescription() {
        return this.description;
    }

    public abstract float cost();
}
