package com.twp.baseline;

public class ExemptedFromSalesTaxImportedGoods extends Goods{

    ExemptedFromSalesTaxImportedGoods(String name, double price) {
        super(name, price);
    }
    @Override
    public double salesTax() {
        return 0.0;
    }

    @Override
    public double importDuty() {
        return price * 5 / 100;
    }
}
