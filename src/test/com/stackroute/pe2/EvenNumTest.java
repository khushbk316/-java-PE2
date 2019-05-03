package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum object;

    @Before
    public void setUp() {
        object = new EvenNum();
    }
    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void EqualsEven() {
        assertEquals(false,object.isEven(24));
    }


    @Test
    public void NotEqualsEven() {
        assertNotEquals(false,object.isEven(24));
    }

}