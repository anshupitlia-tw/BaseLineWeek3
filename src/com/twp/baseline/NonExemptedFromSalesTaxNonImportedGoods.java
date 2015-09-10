package com.twp.baseline;

public class NonExemptedFromSalesTaxNonImportedGoods extends Goods{

    NonExemptedFromSalesTaxNonImportedGoods(String name, double price) {
        super(name, price);
    }
    @Override
    public double salesTax() {
        return price * 10 / 100;
    }

    @Override
    public double importDuty() {
        return 0.0;
    }
}
