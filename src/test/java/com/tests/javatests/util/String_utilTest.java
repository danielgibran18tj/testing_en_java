package com.tests.javatests.util;

public class String_utilTest {
    public static void main(String[] args) {

        
        String result = String_util.repeat("hola", 3);
        assertEquals(result,"holaholahola");

        //String result2 = String_util.repeat("hola", 1);
        assertEquals(String_util.repeat("hola", 1),"hola");
    }

    private static void assertEquals(String actual, String expected) {

        if (!actual.equals(expected)){
            throw new RuntimeException(actual+" is not equal to "+expected);
            //System.out.println("ERROR!!");
        }
    }
}