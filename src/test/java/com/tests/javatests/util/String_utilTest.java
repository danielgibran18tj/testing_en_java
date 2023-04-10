package com.tests.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class String_utilTest {
    @Test
    public void repeat_string_one(){
        Assert.assertEquals("hola", String_util.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times(){
        String result = String_util.repeat("hola", 3); //comando para repetir texto
        Assert.assertEquals("holaholahola", result);  //comprobacion de igualdad
    }
    @Test
    public void repeat_string_zero_time(){
        Assert.assertEquals("", String_util.repeat("hola", 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_time(){
        String_util.repeat("hola", -1);
    }
    @Test
    public void repeat_string2_negative_times() {
        assertThrows(IllegalArgumentException.class , () -> {
            String_util.repeat("hola", -1);
        });
    }
}