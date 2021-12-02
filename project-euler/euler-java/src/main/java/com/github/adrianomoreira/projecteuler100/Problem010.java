package com.github.adrianomoreira.projecteuler100;

public class Problem010 {

    public static Boolean isPrime(long n) {
        long root = (long) Math.sqrt(n);
        for (long i = 2; i <= root; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long primeSummation(long value) {
        long sum = 0;
        for (long i = 2; i < value; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
