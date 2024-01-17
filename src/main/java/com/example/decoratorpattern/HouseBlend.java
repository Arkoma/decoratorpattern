package com.example.decoratorpattern;

public class HouseBlend extends Beverage {

   public HouseBlend() {
       super.description = "Our greatest blend of flavors";
   }

    @Override
    public float cost() {
        return 0;
    }
}
