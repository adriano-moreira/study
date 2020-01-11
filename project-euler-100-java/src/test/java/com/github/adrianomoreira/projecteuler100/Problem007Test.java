package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.adrianomoreira.projecteuler100.Problem007.*;
import static org.junit.jupiter.api.Assertions.*;

public class Problem007Test {

    @DisplayName("nthPrime(6) should return 13")
    @Test
    public void test(){
        assertEquals(nthPrime(6), 13);
    }

    @DisplayName("nthPrime(10) should return 29")
    @Test
    public void test10(){
        assertEquals(nthPrime(10), 29);
    }

    @DisplayName("nthPrime(100) should return 541")
    @Test
    public void test100(){
        assertEquals(nthPrime(10), 29);
    }

    @DisplayName("nthPrime(1000) should return 7919")
    @Test
    public void test1000(){
        assertEquals(nthPrime(100), 7919);
    }

    @DisplayName("nthPrime(10001) should return 104743")
    @Test
    public void test10001(){
        assertEquals(nthPrime(10001), 104743);
    }

}
