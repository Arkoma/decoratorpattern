package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return new SizeAdjusteCondimentPrice(beverage.getSize(), beverage.cost() + .20).getPrice();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
