package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return new SizeAdjusteCondimentPrice(beverage.getSize(), beverage.cost() + .10).getPrice();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
