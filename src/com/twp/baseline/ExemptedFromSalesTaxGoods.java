package com.twp.baseline;

public class ExemptedFromSalesTaxGoods implements  Goods{

    @Override
    public double salesTax() {
        return 0.0;
    }
}
