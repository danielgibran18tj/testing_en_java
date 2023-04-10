package com.tests.javatests.util;

public class Password_util {
    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assessPassword(String password){
        if (password.matches("[a-zA-Z]+")
                ||password.matches("[1-9]+")
                ||password.length()<8) {
            return SecurityLevel.WEAK;
        }else if (password.matches("[a-zA-Z1-9]+")) {
            return SecurityLevel.MEDIUM;
        }else {
            return SecurityLevel.STRONG;
        }
    }
}
