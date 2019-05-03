package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class countWordFrequencyTest {

    CountWordFrequency object;

    @Before
    public void setUp() {
        object = new CountWordFrequency();
    }
    @After
    public void tearDown() {
        object = null;
    }
    @Test
    public void wordWithinStringEquals() {
        assertEquals(3,object.CountWords(3));
    }

    @Test
    public void wordOutsideString() {
        assertEquals(-1,object.CountWords(10));
    }

    @Test
    public void wordWithinStringNotEquals() {
        assertNotEquals(1,object.CountWords(1));
    }

}




