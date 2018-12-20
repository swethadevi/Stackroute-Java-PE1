package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry obj;
    @Before
    public void setUp() throws Exception {
        TomJerry obj = new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        TomJerryTest obj = null;
    }

    @Test
    public void checktomjerry() {

        assertEquals("Tom",obj.checktomjerry(20));
        assertEquals("Tom",obj.checktomjerry(22));
        assertEquals("Jerry",obj.checktomjerry(25));


    }
}