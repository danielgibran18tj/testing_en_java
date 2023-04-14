package com.tests.javatests.discounts;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorShould {
    @Test
    public void total_zero_when_there_are_price() {
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
        assertEquals(calculator.getTotal(), 0.0);
    }
    @Test
    public void total_is_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        assertThat(calculator.getTotal(), is(25.7));
    }
    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(22.5);
        calculator.addPrice(27.5);
        calculator.addPrice(100);

        calculator.setDiscount(20);
        assertThat(calculator.getTotal(), is(120.0));
    }
}