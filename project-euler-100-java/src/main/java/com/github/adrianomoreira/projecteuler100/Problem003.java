package com.github.adrianomoreira.projecteuler100;

public class Problem003 {

    public static long largestPrimeFactor(long value) {
        long prime = 2, max = 1;

        while (prime <= value) {
            if(value % prime == 0) {
                max = prime;
                value /= prime;
            } else prime++;
        }

        return max;
    }
}
