package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodsTest {

    @Test
    public void shouldCalculateAndReturnSalesTaxOfTenPercentOnItsPrice() {
        Goods musicCD = new NonExemptedFromSalesTaxNonImportedGoods("A Music CD", 15.99);

        assertEquals(1.599, musicCD.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnNoTaxOnBookSinceItIsExemptFromSalesTax() {
        Goods book = new ExemptedFromSalesTaxImportedGoods("A Book", 9.8);

        assertEquals(0.0, book.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnNoTaxOnFoodSinceItIsExemptFromSalesTax() {
        Goods food = new ExemptedFromSalesTaxImportedGoods("A chocolate", 8.7);

        assertEquals(0.0, food.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnNoTaxOnMedicalProductsSinceItIsExemptFromSalesTax() {
        Goods pills = new ExemptedFromSalesTaxImportedGoods("A headache pill", 98.7);

        assertEquals(0.0, pills.salesTax(), 0.0001);
    }

    @Test
    public void shouldReturnTotalTaxAsAllTaxesRoundedOff() {
        Goods musicCD = new NonExemptedFromSalesTaxImportedGoods("An imported Music CD", 10.00);

        assertEquals(1.50, musicCD.totalTax(), 0.0001);
    }
}
