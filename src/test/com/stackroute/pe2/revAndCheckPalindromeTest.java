package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class revAndCheckPalindromeTest {

    revAndCheckPalindrome object;

    @Before
    public void setUp() {

        object = new revAndCheckPalindrome();
    }
    @After
    public void tearDown()
    {
        object = null;
    }



    @Test
      public  void checkEquals()
    {
        assertEquals("true",object.checkPalindrome("madam"));
    }

    @Test
    public  void checkNotEquals()
    {
        assertNotEquals("true",object.checkPalindrome("khushbu"));
    }

    @Test
    public  void checkNull()
    {
        String strnull = null;
        String str;
        str = object.checkNullException(strnull);
        assertNull(str);
    }


}
