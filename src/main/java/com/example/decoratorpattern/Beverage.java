package com.example.decoratorpattern;

public abstract class Beverage {

    private Size size = Size.TALL;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    String description = "Unknown Beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
