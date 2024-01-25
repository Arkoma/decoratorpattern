package com.example.decoratorpattern;

public class Decaf extends Beverage {

   public Decaf() {
       super.description = "Decaf Coffee";
   }

    @Override
    public double cost() {
        return 1.05;
    }
}
