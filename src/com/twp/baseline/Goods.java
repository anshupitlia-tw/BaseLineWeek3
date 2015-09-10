package com.twp.baseline;

public abstract class Goods {

    protected String name;
    protected double price;

    Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double salesTax();
    public abstract double importDuty();
}
