package com.example.decoratorpattern.condiment;

import com.example.decoratorpattern.Size;

import static com.example.decoratorpattern.Size.GRANDE;
import static com.example.decoratorpattern.Size.TALL;
import static com.example.decoratorpattern.Size.VENTI;

public class SizeAdjusteCondimentPrice {

    public double getPrice() {
        return price;
    }
    private final double price;

    public SizeAdjusteCondimentPrice(Size size, double price) {
        if (size == TALL) {
            price += .10;
        } else if (size == GRANDE) {
            price += .15;
        } else if (size == VENTI) {
            price += .20;
        }
        this.price = price;
    }
}
