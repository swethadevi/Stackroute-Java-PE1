package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question9_ReverseStringTest {
    Question9_ReverseString obj;

    @Before
    public void setUp() throws Exception {
        Question9_ReverseString obj = new Question9_ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        Question9_ReverseString  obj = null;
    }

    @Test
    public void reverse() {
        assertEquals("ahtews",obj.reverse("swetha"));
        assertEquals("etuorkcats",obj.reverse("stackroute"));
        assertEquals("gnieob",obj.reverse("boeing"));
        assertEquals("lled",obj.reverse("dell"));
        assertEquals("retupmoc",obj.reverse("computer"));


    }
}