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

    public double totalTax() {
        return roundOffTax(salesTax()) + roundOffTax(importDuty());
    }

    public double totalPrice() {
        return price + totalTax();
    }

    private double roundOffTax(double tax) {
        return Math.ceil(tax * 20) / 20;
    }
}
