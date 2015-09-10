package com.twp.baseline;

public class ExemptedFromSalesTaxNonImportedGoods extends Goods{

    ExemptedFromSalesTaxNonImportedGoods(String name, double price) {
        super(name, price);
    }
    @Override
    public double salesTax() {
        return 0.0;
    }

    @Override
    public double importDuty() {
        return 0.0;
    }
}
