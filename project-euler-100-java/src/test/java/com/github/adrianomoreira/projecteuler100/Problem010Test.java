package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem010Test {

    @DisplayName("primeSummation(17) should return 41")
    @Test
    public void test(){
        assertEquals(41, Problem010.primeSummation(17));
    }
    @DisplayName("primeSummation(2001) should return 277050")
    @Test
    public void test1(){
        assertEquals(277050, Problem010.primeSummation(2001));
    }
    @DisplayName("primeSummation(140759) should return 873608362")
    @Test
    public void test2(){
        assertEquals(873608362, Problem010.primeSummation(140759));
    }
    @DisplayName("primeSummation(2000000) should return 142913828922")
    @Test
    public void test3(){
        assertEquals(142913828922L, Problem010.primeSummation(2000000));
    }

}
