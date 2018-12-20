package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question7_AcceptNumberTest {

    Question7_AcceptNumberTest obj = new Question7_AcceptNumberTest();

    @Before
    public void setUp() throws Exception {
        Question7_AcceptNumberTest  obj = new Question7_AcceptNumberTest();
    }

    @After
    public void tearDown() throws Exception {
        Question7_AcceptNumberTest obj = null;
    }

    @Test
    public void test1() {
        assertEquals("76655433",obj.acceptSort("54637365"));
    }
}