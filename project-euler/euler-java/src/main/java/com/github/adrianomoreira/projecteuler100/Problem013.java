package com.github.adrianomoreira.projecteuler100;

import java.math.BigInteger;

public class Problem013 {
    public static String sumLarge(String[] arr) {
        var bigint = BigInteger.ZERO;
        for (String str : arr) {
            bigint = bigint.add(new BigInteger(str));
        }
        return bigint.toString().substring(0,10);
    }
}
