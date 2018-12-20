package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question10_InputRepeatTest {
    Question10_InputRepeat obj;
    @Before
    public void setUp() throws Exception {
        Question10_InputRepeat obj = new Question10_InputRepeat();
    }

    @After
    public  void tearDown() throws Exception {
        Question10_InputRepeat obj = null;
    }

    @Test
    public void repeat() {
        assertEquals("stackroutetete",obj.repeat("stackroute",2));
        assertEquals("swethahaha",obj.repeat("swetha",2));
        //assertNotEquals("testing",obj.repeat("testing",2),);

    }

}