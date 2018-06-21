package com.yulin.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void factorial() {
        System.out.println("factorial");
        try {
            assertEquals(120, new Math().factorial(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}