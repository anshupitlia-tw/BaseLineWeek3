package com.twp.baseline;

public class ImportedGoods {
    double price;

    ImportedGoods(double price) {
        this.price = price;
    }

    public double importDuty() {
        return price * 5 / 100;
    }
}
