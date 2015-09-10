package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExemptedFromSalesTaxGoodsTest {

    @Test
    public void shouldReturnZeroAsTheSalesTax() {
        ExemptedFromSalesTaxGoods exemptedFromSalesTaxGoods = new ExemptedFromSalesTaxGoods();

        assertEquals(0.0, exemptedFromSalesTaxGoods.salesTax(), 0.0001);
    }
}
