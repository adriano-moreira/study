package com.github.adrianomoreira.projecteuler100;

import java.util.ArrayList;
import java.util.List;

public class Problem004 {

    private static String reverse(String str) {
        var sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }

    public static double largestPalindromeProduct(double value) {
        int max = (int)Math.pow(10, value) - 1;
        int min = (int) Math.pow(10, value - 1) - 1;
        List<Integer> palindromes = new ArrayList<>();
        for (int x = min; x <= max; x++) {
            for (int y = min; y <= max; y++) {
                int product = x * y;
                String asString = Integer.toString(product);
                String reverse = reverse(asString);
                if (reverse.equals(asString)) {
                    palindromes.add(product);
                }
            }
        }
        palindromes.sort(Integer::compareTo);
        return palindromes.get(palindromes.size() - 1);
    }
}
