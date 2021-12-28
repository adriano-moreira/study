package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.Test;

import static com.github.adrianomoreira.projecteuler100.Problem014.longestCollatzSequence;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem014Test {

    @Test
    void longestChainTest() {
        assertEquals(9, longestCollatzSequence(14));
        assertEquals(3711, longestCollatzSequence(5847));
        assertEquals(35655, longestCollatzSequence(46500));
        assertEquals(52527, longestCollatzSequence(54512));
        assertEquals(77031, longestCollatzSequence(100000));
        assertEquals(837799, longestCollatzSequence(1000000));
    }

}