package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonExemptedFromSalesTaxGoodsTest {

    @Test
    public void shouldReturnTenPercentOfPriceForNonExemptedGoods() {
        NonExemptedFromSalesTaxGoods nonExemptedFromSalesTaxGoods = new NonExemptedFromSalesTaxGoods(19.89);

        assertEquals(1.989, nonExemptedFromSalesTaxGoods.salesTax(), 0.0001);
    }
}
