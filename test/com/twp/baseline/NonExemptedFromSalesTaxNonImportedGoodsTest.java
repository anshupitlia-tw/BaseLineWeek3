package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonExemptedFromSalesTaxNonImportedGoodsTest {

    @Test
    public void shouldReturnSalesTaxOfTenPercent() {
        NonExemptedFromSalesTaxNonImportedGoods nonExemptedFromSalesTaxNonImportedGoods = new NonExemptedFromSalesTaxNonImportedGoods("a chocolate", 19.8);

        assertEquals(1.98, nonExemptedFromSalesTaxNonImportedGoods.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnZeroAsImportDuty() {
        NonExemptedFromSalesTaxNonImportedGoods nonExemptedFromSalesTaxNonImportedGoods = new NonExemptedFromSalesTaxNonImportedGoods("a chocolate", 19.8);

        assertEquals(0.0, nonExemptedFromSalesTaxNonImportedGoods.importDuty(), 0.0001);
    }
}