package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;

import static com.example.decoratorpattern.Beverage.Size.GRANDE;
import static com.example.decoratorpattern.Beverage.Size.TALL;
import static com.example.decoratorpattern.Beverage.Size.VENTI;

public class Mocha extends CondimentDecorator {

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return SizePriceAdjuster.adjuctPriceForSize(beverage.getSize(), beverage.cost() + .20);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
