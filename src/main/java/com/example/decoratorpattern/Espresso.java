package com.example.decoratorpattern;

public class Espresso extends Beverage {

   public Espresso() {
       super.description = "Our strongest coffee beverage";
   }

    @Override
    public float cost() {
        return 0;
    }
}
