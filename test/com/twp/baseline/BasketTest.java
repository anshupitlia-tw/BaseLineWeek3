package com.twp.baseline;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasketTest {

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
    public void shouldGenerateReceiptShowingTheNameOfItemTheirPriceInclOfTaxesAndTotalCostAndTotalAmount() {
        Goods oneGoods = mock(Goods.class);
        Goods twoGoods = mock(Goods.class);
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(oneGoods);
        goodsList.add(twoGoods);
        Basket basket = new Basket(goodsList);

        when(oneGoods.getName()).thenReturn("Good 1");
        when(twoGoods.getName()).thenReturn("Good 2");
        when(oneGoods.totalTax()).thenReturn(1.20);
        when(twoGoods.totalTax()).thenReturn(0.15);
        when(oneGoods.totalPrice()).thenReturn(12.65);
        when(twoGoods.totalPrice()).thenReturn(1.15);

        basket.receipt();
        assertEquals("Good 1:12.65\n" +
                "Good 2:1.15\n" +
                "Sales Tax:1.3499999999999999\n" +
                "Total:13.8\n", outContent.toString());
    }
}
