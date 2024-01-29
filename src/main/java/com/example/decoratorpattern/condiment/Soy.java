package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;

import static com.example.decoratorpattern.Beverage.Size.GRANDE;
import static com.example.decoratorpattern.Beverage.Size.TALL;
import static com.example.decoratorpattern.Beverage.Size.VENTI;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return SizePriceAdjuster.adjuctPriceForSize(beverage.getSize(), beverage.cost() + .15);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
