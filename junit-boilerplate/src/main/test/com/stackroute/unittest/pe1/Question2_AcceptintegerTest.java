package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question2_AcceptintegerTest {

    Question2_Acceptinteger obj;
    @Before
    public void setUp() throws Exception {
        Question2_Acceptinteger obj = new Question2_Acceptinteger();
    }

    @After
    public void tearDown() throws Exception {
        Question2_Acceptinteger obj = null;
    }

    @Test
    public void palindrome_check() {
        assertEquals("TOM", obj.palindrome_check(25));
    }

    @Test
    public void palindrome_check1() {
        assertEquals("JERRY", obj.palindrome_check(10));

    }

    @Test
    public void palindrome_check2() {
        assertEquals("TOM", obj.palindrome_check(29));

    }
}