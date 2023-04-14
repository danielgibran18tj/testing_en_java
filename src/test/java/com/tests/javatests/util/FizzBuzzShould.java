package com.tests.javatests.util;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FizzBuzzShould {
    /*
    Si el número es divisible por 3, retorna “Fizz”
    Si el número es divisible por 5, retorna “Buzz”
    Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
    En otro caso, retorna el mismo número

    fizzBuzz(3) ⇒ "Fizz"
    fizzBuzz(6) ⇒ "Fizz"
    fizzBuzz(5) ⇒ "Buzz"
    fizzBuzz(10) ⇒ "Buzz"
    fizzBuzz(15) ⇒ "FizzBuzz"
    fizzBuzz(30) ⇒ "FizzBuzz"
    fizzBuzz(2) ⇒ "2"
    fizzBuzz(16) ⇒ "16"
    */
    @Test
    public void divisible_3() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz") );
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz") );
    }
    @Test
    public void divisible_5() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz") );
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz") );
    }
    @Test
    public void divisible_3_5() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz") );
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz") );
    }
    @Test
    public void divisible_none() {
        assertThat(FizzBuzz.fizzBuzz(2), is("2") );
        assertThat(FizzBuzz.fizzBuzz(16), is("16") );
    }
}