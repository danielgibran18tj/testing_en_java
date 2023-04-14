package com.tests.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private List<Double> prices = new ArrayList<>();
    private double descuento = 0;
    public Object getTotal() {
        double result = 0;

        for (Double price : prices) {
            result+= price;
        }
        result = result * ((100-descuento)/100);
        return result;
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double i) {
        descuento = descuento + i;
    }
}
