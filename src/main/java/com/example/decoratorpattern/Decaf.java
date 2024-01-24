package com.example.decoratorpattern;

public class Decaf extends Beverage {

   public Decaf() {
       super.description = "Get some coffee flavor and fall asleep with the cup in your hands";
   }

    @Override
    public float cost() {
        return 0;
    }
}
