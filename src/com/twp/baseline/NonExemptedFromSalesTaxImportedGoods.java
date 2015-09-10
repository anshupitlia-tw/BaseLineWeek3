package com.twp.baseline;

public class NonExemptedFromSalesTaxImportedGoods extends Goods{

    NonExemptedFromSalesTaxImportedGoods(String name, double price) {
        super(name, price);
    }

    @Override
    public double salesTax() {
        return price * 10 / 100;
    }

    @Override
    public double importDuty() {
        return price * 5 / 100;
    }
}
