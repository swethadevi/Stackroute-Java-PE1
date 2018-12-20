package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question6_CheckVCNTest {

    Question6_CheckVCN obj;
    @Before
    public void setUp() throws Exception {
        Question6_CheckVCN obj = new Question6_CheckVCN();
    }

    @After
    public void tearDown() throws Exception {
        Question6_CheckVCN obj = null;
    }

    @Test
    public void check_CheckVCN() {
        assertEquals("Capital Letter", obj.check_CheckVCN("S"));
    }

    @Test
    public void test1() {
        assertEquals("Small Letter", obj.check_CheckVCN("w"));
    }

    @Test
    public void test2() {
        assertEquals("Small Letter", obj.check_CheckVCN("e"));
    }
}