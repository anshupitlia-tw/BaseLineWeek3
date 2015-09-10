package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodsTest {

    @Test
    public void shouldCalculateAndReturnSalesTaxOfTenPercentOnItsPrice() {
        Goods musicCD = new Goods("Music CD", 15.99);

        assertEquals(1.599, musicCD.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnNoTaxOnBookSinceItIsExemptFromSalesTax() {
        Goods book = new Goods("A book", 10.67);

        assertEquals(0.0, book.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnNoTaxOnFoodSinceItIsExemptFromSalesTax() {
        Goods book = new Goods("A chocolate", 10.67);

        assertEquals(0.0, book.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnNoTaxOnMedicalProductsSinceItIsExemptFromSalesTax() {
        Goods book = new Goods("Headache pills", 10.67);

        assertEquals(0.0, book.salesTax(), 0.0001);
    }
}
