package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
