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

    public void getDisplayableTotalTax() {
        System.out.println(totalTax());
    }

    public void getDisplayableName() {
        System.out.print(name);
    }
    public void getDisplayableTotalPrice() {
        System.out.println(price + totalTax());
    }

    private double totalTax() {
        return roundOffTax(salesTax()) + roundOffTax(importDuty());
    }

    private double roundOffTax(double tax) {
        return Math.ceil(tax * 20) / 20;
    }
}
