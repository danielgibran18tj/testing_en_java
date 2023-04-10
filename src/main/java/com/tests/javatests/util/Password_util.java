package com.tests.javatests.util;

public class Password_util {
    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assessPassword(String password){
        return SecurityLevel.WEAK;
    }
}
