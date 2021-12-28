package com.github.adrianomoreira.projecteuler100;

public class Problem014 {

    static long next(long value) {
        if (value % 2 == 0) {
            return (value / 2);
        } else {
            return 3 * value + 1;
        }
    }

    static long chainLength(long startNumber) {
        if (startNumber == 1) {
            return 1;
        }
        long size = 1;
        long n = startNumber;

        while ((n = next(n)) != 1) {
            size++;
        }

        return size;
    }

    public static long longestCollatzSequence(long len) {
        long longest = 1;
        long chainSize = 1;

        for (long i = 2; i < len; i++) {
            long currentLength = chainLength(i);
            if (currentLength > chainSize) {
                chainSize = currentLength;
                longest = i;
            }
        }
        return longest;
    }
}
