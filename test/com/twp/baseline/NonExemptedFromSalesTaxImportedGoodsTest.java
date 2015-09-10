package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonExemptedFromSalesTaxImportedGoodsTest {

    @Test
    public void shouldReturnTenPercentOfPriceForNonExemptedGoods() {
        NonExemptedFromSalesTaxImportedGoods nonExemptedFromSalesTaxImportedGoods = new NonExemptedFromSalesTaxImportedGoods("an imported Music CD", 19.89);

        assertEquals(1.989, nonExemptedFromSalesTaxImportedGoods.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnFivePercentAsImportDuty() {
        NonExemptedFromSalesTaxImportedGoods nonExemptedFromSalesTaxImportedGoods = new NonExemptedFromSalesTaxImportedGoods("an imported Music CD", 19.89);

        assertEquals(0.9945, nonExemptedFromSalesTaxImportedGoods.importDuty(), 0.0001);
    }
}
