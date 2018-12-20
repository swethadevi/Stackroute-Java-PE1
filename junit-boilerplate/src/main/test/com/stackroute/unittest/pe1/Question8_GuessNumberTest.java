package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question8_GuessNumberTest {

    Question8_GuessNumber obj;

    @Before
    public void setUp() throws Exception {
        Question8_GuessNumber obj = new Question8_GuessNumber();
    }

    @After
    public void tearDown() throws Exception {
        Question8_GuessNumber  obj = null;
    }

    @Test
    public void check_guessnum() {
        assertEquals("Guessed Number is more than Original Number",obj.check_guessnum(110,101));
        assertEquals("Guessed Number is more than Original Number",obj.check_guessnum(200,101));
        assertEquals("Guessed Number is more than Original Number",obj.check_guessnum(300,101));
        assertEquals("Guessed Number is leser than than the Original Number",obj.check_guessnum(50,101));
        assertEquals("Guessed Number is leser than than the Original Number",obj.check_guessnum(90,101));
    }
}