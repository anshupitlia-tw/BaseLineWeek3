package com.twp.baseline;

public class NonExemptedFromSalesTaxGoods implements Goods{
    private double price;

    NonExemptedFromSalesTaxGoods(double price) {
        this.price = price;
    }
    @Override
    public double salesTax() {
        return price * 10 / 100;
    }
}
