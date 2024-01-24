package com.example.decoratorpattern;

public class DarkRoast extends Beverage {

   public DarkRoast() {
       super.description = "Get that smoky flavor";
   }

    @Override
    public float cost() {
        return 0;
    }
}
