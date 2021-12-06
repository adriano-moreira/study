package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem002Test {

    @DisplayName("fibonacciEvenSum(X) should return Y")
    @Test
    public void test() {
        assertEquals(44, Problem002.fibonacciEvenSum(10));
        assertEquals(3382, Problem002.fibonacciEvenSum(18));
        assertEquals(60696, Problem002.fibonacciEvenSum(23));
        assertEquals(350704366, Problem002.fibonacciEvenSum(43));
    }

}
