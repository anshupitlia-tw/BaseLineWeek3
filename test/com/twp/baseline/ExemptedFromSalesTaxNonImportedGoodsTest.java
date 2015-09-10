package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExemptedFromSalesTaxNonImportedGoodsTest {

    @Test
    public void shouldReturnZeroAsSalesTax() {
        ExemptedFromSalesTaxNonImportedGoods exemptedFromSalesTaxNonImportedGoods = new ExemptedFromSalesTaxNonImportedGoods("a book", 5.99);

        assertEquals(0.0, exemptedFromSalesTaxNonImportedGoods.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnZeroAsImportDuty() {
        ExemptedFromSalesTaxNonImportedGoods exemptedFromSalesTaxNonImportedGoods = new ExemptedFromSalesTaxNonImportedGoods("a book", 5.99);

        assertEquals(0.0, exemptedFromSalesTaxNonImportedGoods.importDuty(), 0.0001);
    }
}
