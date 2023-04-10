package com.tests.javatests.util;

import org.junit.Test;

import static com.tests.javatests.util.Password_util.SecurityLevel.*;
import static org.junit.Assert.*;

public class Password_utilTest {
    @Test
    public void weak_when_has_less_than_8() {
        assertEquals(WEAK,Password_util.assessPassword("12fr&&"));
    }
    @Test
    public void weak_when_has_only_numbers() {
        assertEquals(WEAK,Password_util.assessPassword("1234567"));
    }
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK,Password_util.assessPassword("abcdefgh"));
    }
    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM,Password_util.assessPassword("abcd1234SS"));
    }
    @Test
    public void strong_when_has_letters_numbers_symbols() {
        assertEquals(STRONG,Password_util.assessPassword("abcd1234!"));
    }
}