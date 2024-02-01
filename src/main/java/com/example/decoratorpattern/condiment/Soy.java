package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return new SizeAdjusteCondimentPrice(beverage.getSize(), beverage.cost() + .15).getPrice();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
