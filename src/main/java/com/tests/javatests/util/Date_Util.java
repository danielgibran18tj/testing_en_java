package com.tests.javatests.util;

public class Date_Util {
    public static boolean isLeapYear(int year){
        if ((year%400==0)||(year % 4 == 0 && year % 100 != 0)){
            return true;
        }else {
            return false;
        }
        //return (year % 4 == 0 && year % 100 != 0) || (year % 400) == 0;
    }
}
