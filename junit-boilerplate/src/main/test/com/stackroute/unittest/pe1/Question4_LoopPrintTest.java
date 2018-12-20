package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question4_LoopPrintTest {

    Question4_LoopPrint obj;
    @Before
    public void setUp() throws Exception {
        Question4_LoopPrint  obj = new Question4_LoopPrint();
    }

    @After
    public void tearDown() throws Exception {
        Question4_LoopPrint obj = null;
    }


    @Test
    public void check_loopPrint() {
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 7 7 7 7 7 7 7 8 8 8 8 8 8 8 8 9 9 9 9 9 9 9 9 9 10 10 10 10 10 10 10 10 10 10 \n", obj.check_loopPrint(10));
    }
}