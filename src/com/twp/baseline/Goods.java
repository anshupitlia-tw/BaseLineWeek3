package com.twp.baseline;

public class Goods {
    private String name;
    private double price;

    Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double salesTax() {
        if (!name.contains("book") && (!name.contains("chocolate")) && (!name.contains("pills"))) {
            return price * 10 / 100;
        }
        else {
            return 0.0;
        }
    }
}
