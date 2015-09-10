package com.twp.baseline;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Goods> basket = new ArrayList<Goods>();

    Basket(List<Goods> basket) {
        this.basket = basket;
    }

    private double totalTaxesPaid() {
        double totalTax = 0.0;
        for (Goods goods : basket) {
            totalTax += goods.totalTax();
        }
        return totalTax;
    }

    private double totalCost() {
        double totalCost = 0.0;
        for (Goods goods : basket) {
            totalCost += goods.totalPrice();
        }
        return totalCost;
    }

    public void receipt() {
        for (Goods goods : basket){
            System.out.println(goods.getName() + ":" + goods.totalPrice());
        }
        System.out.println("Sales Tax:"+ totalTaxesPaid());
        System.out.println("Total:" + totalCost());
    }
}
