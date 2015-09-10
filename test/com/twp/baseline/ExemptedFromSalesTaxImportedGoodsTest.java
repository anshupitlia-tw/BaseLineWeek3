package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExemptedFromSalesTaxImportedGoodsTest {

    @Test
    public void shouldReturnZeroAsTheSalesTax() {
        ExemptedFromSalesTaxImportedGoods exemptedFromSalesTaxImportedGoods = new ExemptedFromSalesTaxImportedGoods("A book", 8.9);

        assertEquals(0.0, exemptedFromSalesTaxImportedGoods.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnFivePercentAsImportDuty() {
        ExemptedFromSalesTaxImportedGoods exemptedFromSalesTaxImportedGoods = new ExemptedFromSalesTaxImportedGoods("an imported book", 8.9);

        assertEquals(0.445, exemptedFromSalesTaxImportedGoods.importDuty(), 0.0001);
    }
}
