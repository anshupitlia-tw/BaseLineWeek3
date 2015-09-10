package com.twp.baseline;

public class Goods {
    private String name;
    private double price;

    Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double salesTax() {
        return price * 10 / 100;
    }
}
