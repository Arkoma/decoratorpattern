package com.example.decoratorpattern;

public abstract class Beverage {

    String description = "";

    boolean milk;
    boolean soy;

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    boolean mocha;
    boolean whip;

    public String getDescription() {
        return this.description;
    }

    public abstract float cost();
}
