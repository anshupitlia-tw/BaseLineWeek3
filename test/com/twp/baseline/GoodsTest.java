package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodsTest {

    @Test
    public void shouldCalculateAndReturnSalesTaxOfTenPercentOnItsPrice() {
        Goods musicCD = new Goods("Music CD", 15.99);

        assertEquals(1.599, musicCD.salesTax(), 0.0001);
    }
}
