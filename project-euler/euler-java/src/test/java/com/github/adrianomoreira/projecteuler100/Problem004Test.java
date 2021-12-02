package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem004Test {

    @DisplayName("largestPalindromeProduct(2) should return 9009.")
    @Test
    public void test() {
        Assertions.assertEquals(9009, Problem004.largestPalindromeProduct(2));
    }

    @DisplayName("largestPalindromeProduct(3) should return 906609.")
    @Test
    public void test2() {
        Assertions.assertEquals(906609, Problem004.largestPalindromeProduct(3));
    }


}
