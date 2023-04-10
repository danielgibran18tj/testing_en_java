package com.tests.javatests.util;

import org.junit.Test;

import static com.tests.javatests.util.Password_util.SecurityLevel.WEAK;
import static org.junit.Assert.*;

public class Password_utilTest {
    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK,Password_util.assessPassword("1234567"));
    }
}