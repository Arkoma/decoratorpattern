package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;

import static com.example.decoratorpattern.Beverage.Size.GRANDE;
import static com.example.decoratorpattern.Beverage.Size.TALL;
import static com.example.decoratorpattern.Beverage.Size.VENTI;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return SizePriceAdjuster.adjuctPriceForSize(beverage.getSize(), beverage.cost() + .10);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
