package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.Test;

import static com.github.adrianomoreira.projecteuler100.Problem012.divisibleTriangleNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem012Test {

    @Test
    public void test() {
        assertEquals(28, divisibleTriangleNumber(5));
        assertEquals(630, divisibleTriangleNumber(23));
        assertEquals(1385280, divisibleTriangleNumber(167));
        assertEquals(17907120, divisibleTriangleNumber(374));
        assertEquals(76576500, divisibleTriangleNumber(500));
    }

}
