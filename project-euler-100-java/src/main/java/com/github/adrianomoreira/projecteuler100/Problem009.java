package com.github.adrianomoreira.projecteuler100;

public class Problem009 {
    public static int specialPythagoreanTriplet(int n) {
        for (int c = n - 2; c > 0; c--) {
            for (int b = c - 1; b > 0; b--) {
                for (int a = b - 1; a > 0; a--) {
                    if (a + b + c == n) {
                        if (isPythagorean(a, b, c)) {
                            return a * b * c;
                        }
                    }
                }
            }
        }

        throw new RuntimeException("not found");
    }

    private static boolean isPythagorean(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}
