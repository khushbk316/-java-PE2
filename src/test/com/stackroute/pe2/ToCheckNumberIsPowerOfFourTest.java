package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToCheckNumberIsPowerOfFourTest {
    ToCheckNumberIsPowerOfFour object;
    @Before
    public void setUp() throws Exception {
        object=new ToCheckNumberIsPowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
      object=null;
    }

    @Test
    public void checkingNumberIsPowerOfFour() {
        assertEquals(false, object.checkingNumberIsPowerOfFour(0));
    }

    @Test
    public void checkingNumberIsNotPowerOfFour() {
        assertNotEquals(true, object.checkingNumberIsPowerOfFour(24));
    }

    @Test
    public void givenNegativeNumShouldReturnFalse()
    {
        boolean result =object.checkingNumberIsPowerOfFour(-2);
        assertFalse(result);
    }

}