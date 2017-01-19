package com.example.androidtestdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangyuhang on 2017/1/17.
 */
public class CalculatorTest {
    private Calculator mCalculator;

    @BeforeClass
    public static void beforeTest() throws Exception {
        System.out.println("---Calling beforeTest---");
    }

    @AfterClass
    public static void afterTest() throws Exception {
        System.out.println("---Calling afterTest---");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("---Calling setUp---");
        mCalculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("---Calling tearDown---");
    }

    @Test
    public void sum() throws Exception {
        System.out.println("---Calling sum---");
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void substract() throws Exception {
        System.out.println("---Calling substract---");
        assertEquals(1d, mCalculator.substract(5d, 4d), 0);
    }

    @Test
    public void divide() throws Exception {
        System.out.println("---Calling divide---");
        assertEquals(4d, mCalculator.divide(20d, 5d), 0);
    }

    @Test
    public void multiply() throws Exception {
        System.out.println("---Calling multiply---");
        assertEquals(10d, mCalculator.multiply(2d, 5d), 0);
    }

}