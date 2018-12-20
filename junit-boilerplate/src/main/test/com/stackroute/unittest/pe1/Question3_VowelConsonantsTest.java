package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question3_VowelConsonantsTest {
    Question3_VowelConsonants obj;

    @Before
    public void setUp() throws Exception {
        Question3_VowelConsonants obj = new Question3_VowelConsonants();
    }

    @After
    public void tearDown() throws Exception {
        Question3_VowelConsonants obj = null;
    }

    @Test
    public void Test_Vowel_Consonant() {
        assertEquals("BCONSONANT oVOWEL eVOWEL iVOWEL nCONSONANT gCONSONANT", obj.Check_VowelConsonant("Boeing"));
    }

    @Test
    public void Test_Vowel_Consonant1() {
        assertEquals("sCONSONANT tCONSONANT aVOWEL cCONSONANT kCONSONANT rCONSONANT oVOWEL uVOWEL tCONSONANT eVOWEL ", obj.Check_VowelConsonant("stackroute"));
    }
}