package com.twp.baseline;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    public void shouldReturnTotalTax() {
        Goods pills = new NonExemptedFromSalesTaxImportedGoods("An imported movie CD", 98.7);

        assertEquals(14.85, pills.totalTax(), 0.0001);
    }

    @Test
    public void shouldReturnTotalPrice() {
        Goods pills = new NonExemptedFromSalesTaxImportedGoods("An imported movie CD", 98.7);

        assertEquals(113.550, pills.totalPrice(), 0.0001);
    }
}
