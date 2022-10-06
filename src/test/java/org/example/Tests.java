package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    private int a = 8;
    private int b = 2;

    @Test
    public void sumTest(){
        int sum = Calc.sum(a, b);
        assertEquals(10, sum);
    }

    @Test
    public void subTest(){
        int sum = Calc.sub(a, b);
        assertEquals(6, sum);
    }

    @Test
    public void multTest(){
        int sum = Calc.mult(a, b);
        assertEquals(16, sum);
    }

    @Test
    public void divTest(){
        int sum = Calc.div(a, b);
        assertEquals(4, sum);
    }

}
