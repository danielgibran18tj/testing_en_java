package com.tests.javatests.StringVacio;

import org.junit.Test;

import static org.junit.Assert.*;

public class String_UtilTest {
    @Test
    public void string_no_es_vacio() {
        assertFalse(String_Util.isEmpty("Marcos"));
    }
    @Test
    public void string__es_vacio() {
        assertTrue(String_Util.isEmpty(""));
    }
    @Test
    public void string__es_vacio_con_espacio() {
        assertTrue(String_Util.isEmpty("    "));
    }
    @Test
    public void string_es_null() {
        assertTrue(String_Util.isEmpty(null));
    }
}