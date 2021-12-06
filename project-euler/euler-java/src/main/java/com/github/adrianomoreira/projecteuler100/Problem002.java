package com.github.adrianomoreira.projecteuler100;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class Problem002 {

    private static List<Integer> fibonacciSequence(int n) {
        var sequence = new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(2);
        while (sequence.size() < n) {
            var last = sequence.get(sequence.size() - 1);
            var penultimate = sequence.get(sequence.size() - 2);
            sequence.add(last + penultimate);
        }
        return sequence;
    }

    public static int fibonacciEvenSum(int number) {
        IntPredicate isEven = (n) -> n % 2 == 0;
        return fibonacciSequence(number)
                .stream()
                .mapToInt(Integer::intValue)
                .filter(isEven)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
