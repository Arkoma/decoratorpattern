package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;
import com.example.decoratorpattern.Size;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }

}
