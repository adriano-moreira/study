package com.github.adrianomoreira.projecteuler100;

import com.github.adrianomoreira.projecteuler100.Problem002;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem002Test {

    @DisplayName("fiboEvenSum(10) should return 44")
    @Test
    public void test() {
        assertEquals(44, Problem002.fiboEvenSum(10));
    }

    @DisplayName("fiboEvenSum(18) should return 3382")
    @Test
    public void test2() {
        assertEquals(3382, Problem002.fiboEvenSum(18));
    }

    @DisplayName("fiboEvenSum(23) should return 60696")
    @Test
    public void test3() {
        assertEquals(60696, Problem002.fiboEvenSum(23));
    }

    @DisplayName("fiboEvenSum(43) should return 350704366")
    @Test
    public void test4() {
        assertEquals(350704366, Problem002.fiboEvenSum(43));
    }
//    Your function should return an even value.%

}
