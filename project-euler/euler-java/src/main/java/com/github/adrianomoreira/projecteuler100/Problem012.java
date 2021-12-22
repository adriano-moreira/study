package com.github.adrianomoreira.projecteuler100;

public class Problem012 {


    static int getFactorsCount(long n) {
        int count = 2;
        var end = Math.sqrt(n);
        for (int i = 2; i < end; i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        if ((long) end * (long) end == n) {
            count++;
        }
        return count;
    }

    public static int divisibleTriangleNumber(long factorsCount) {
        int line = 1;
        int sum = 1;
        int currentFactorsCount;
        do {
            line++;
            sum += line;
            currentFactorsCount = getFactorsCount(sum);
        } while (currentFactorsCount - 1 < factorsCount);
        return sum;
    }
}
