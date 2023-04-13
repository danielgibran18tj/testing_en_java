package com.tests.javatests.StringVacio;

public class String_Util {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() <= 0; //trim.- elimina espacios en blanco para no contar como texto
    }
}
