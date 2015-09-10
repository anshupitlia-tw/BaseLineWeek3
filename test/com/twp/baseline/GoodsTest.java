package com.twp.baseline;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class GoodsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setOutContent() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpOutContent() {
        System.setOut(System.out);
    }

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
    public void shouldPrintTotalTaxAsAllTaxesRoundedOff() {
        Goods musicCD = new NonExemptedFromSalesTaxImportedGoods("An imported Music CD", 10.00);

        musicCD.getDisplayableTotalTax();
        assertEquals("1.5\n", outContent.toString());
    }

    @Test
    public void shouldPrintTotalPriceAsPricePlusAllTaxesRoundedOff() {
        Goods musicCD = new NonExemptedFromSalesTaxImportedGoods("An imported Music CD", 10.00);

        musicCD.getDisplayableTotalPrice();

        assertEquals("11.5\n", outContent.toString());
    }
}
