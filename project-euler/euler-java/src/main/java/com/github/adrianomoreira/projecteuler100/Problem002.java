package com.github.adrianomoreira.projecteuler100;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class Problem002 {

    private static List<Integer> fiboSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);
        while (sequence.size() < n) {
            sequence.add(sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2));
        }
        return sequence;
    }

    public static int fiboEvenSum(int number) {
        IntPredicate isEven = (n) -> n % 2 == 0;
        return fiboSequence(number)
                .stream()
                .mapToInt(Integer::intValue)
                .filter(isEven)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
