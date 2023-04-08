package com.tests.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class String_utilTest {
    @Test
    public void testRepeat(){

        String result = String_util.repeat("hola", 3);
        Assert.assertEquals("holaholahola", result);

        Assert.assertEquals("hola", String_util.repeat("hola", 1));
    }
}