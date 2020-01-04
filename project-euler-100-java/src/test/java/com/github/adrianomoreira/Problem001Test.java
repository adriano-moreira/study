package com.github.adrianomoreira;

import com.github.adrianomoreira.projecteuler100.Problem001;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem001Test {

    @DisplayName("multiplesOf3and5(1000) should return 233168.")
    @Test
    public void test() {
        assertEquals(233168 , Problem001.multiplesOf3And5Java7(1000));
        assertEquals(233168 , Problem001.multiplesOf3And5(1000));
    }

    @DisplayName("multiplesOf3and5(49) should return 543.")
    @Test
    public void test2() {
        assertEquals(543 , Problem001.multiplesOf3And5Java7(49));
        assertEquals(543 , Problem001.multiplesOf3And5(49));
    }

    @DisplayName("multiplesOf3and5(19564) should return 89301183.")
    @Test
    public void test3() {
        assertEquals( 89301183 , Problem001.multiplesOf3And5Java7(19564));
        assertEquals( 89301183 , Problem001.multiplesOf3And5(19564));
    }

    @DisplayName("multiplesOf3and5(8456) should return 16687353.")
    @Test
    public void test4() {
        assertEquals(16687353, Problem001.multiplesOf3And5Java7(8456));
        assertEquals(16687353, Problem001.multiplesOf3And5(8456));
    }

}
