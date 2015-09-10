package com.twp.baseline;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasketTest {

    @Test
    public void shouldCalculateTotalTaxesPaid() {
        Goods oneGoods = mock(Goods.class);
        Goods twoGoods = mock(Goods.class);
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(oneGoods);
        goodsList.add(twoGoods);
        Basket basket = new Basket(goodsList);

        when(oneGoods.totalTax()).thenReturn(1.65);
        when(twoGoods.totalTax()).thenReturn(0.15);
        
        assertEquals(1.80, basket.totalTaxesPaid(), 0.0001);
    }
}
