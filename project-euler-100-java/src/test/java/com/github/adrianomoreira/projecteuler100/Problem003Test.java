package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem003Test {

    @DisplayName("largestPrimeFactor(2) should return 2")
    @Test
    public void test(){
        Assertions.assertEquals(2, Problem003.largestPrimeFactor(2));
    }

    @DisplayName("largestPrimeFactor(3) should return 3")
    @Test
    public void test2(){
        Assertions.assertEquals(3, Problem003.largestPrimeFactor(3));
    }
    @DisplayName("largestPrimeFactor(5) should return 5")
    @Test
    public void test3(){
        Assertions.assertEquals(5, Problem003.largestPrimeFactor(5));
    }
    @DisplayName("largestPrimeFactor(7) should return 7")
    @Test
    public void test4(){
        Assertions.assertEquals(7, Problem003.largestPrimeFactor(7));
    }
    @DisplayName("largestPrimeFactor(29) should return 13195")
    @Test
    public void test5(){
        Assertions.assertEquals(29, Problem003.largestPrimeFactor(13195));
    }
    @DisplayName("largestPrimeFactor(6857) should return 600851475143")
    @Test
    public void test6(){
        Assertions.assertEquals(6857, Problem003.largestPrimeFactor(600851475143L));
    }

}
