package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Beverage;

import static com.example.decoratorpattern.Beverage.Size.GRANDE;
import static com.example.decoratorpattern.Beverage.Size.TALL;
import static com.example.decoratorpattern.Beverage.Size.VENTI;

public class SizePriceAdjuster {

    public static double adjuctPriceForSize(Beverage.Size size, double cost) {
        if (size == TALL) {
            cost += .10;
        } else if (size == GRANDE) {
            cost += .15;
        } else if (size == VENTI) {
            cost += .20;
        }
        return cost;
    }
}
