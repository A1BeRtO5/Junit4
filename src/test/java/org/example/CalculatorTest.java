package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void whenAddTenToFiveResultFifteen() {
        int expected1 = 15;
        int result1 = calculator.add(10, 5);
        assertEquals(expected1, result1);
    }
    @Test
    public void whenAddOneHundredToFiftyResultOneHundredFifty() {
        int expected2 = 150;
        int result2 = calculator.add(100, 50);
        assertEquals(expected2, result2);
    }
    @Test
    public void whenTwoHundredMinusFiftyResultOneHundredFifty() {
        // -
        int expected3 = 150;
        int result3 = calculator.minus(200, 50);
        assertEquals(expected3, result3);
    }
    @Test
    public void whenTwoHundredMinusOneHundredNinetyNineResultOneHundredFifty() {
            int expected4 = 1;
            int result4 = calculator.minus(200, 199);
            assertEquals(expected4, result4);
        }
    @Test
    public void whenDivideOneToOneResulOne() {
        //  /
        int expected5 = 1;
        double result5 = calculator.divide(1, 1);
        assertEquals(expected5, result5, 0.001);
    }
    @Test (expected = ArithmeticException.class) // ловимо помилку
    public void whenDivideOneToZeroResultException() {
        double result6 = calculator.divide(1, 0);
    }
    @Test
    public void whenMultiplyFourToFourResultSixteen() {
        //  *
        int expect = 16;
        int result = calculator.multiply(4, 4);
        assertEquals(expect, result);
    }
    @Test
    public void whenMultiplyThreeToFourResultTwelve() {
        int expect1 = 12;
        int result1 = calculator.multiply(3,4);
        assertEquals(expect1, result1);
    }
    @After// метод який закривається після всіх методів
    public void tearDown() {
        calculator = null;
    }
}