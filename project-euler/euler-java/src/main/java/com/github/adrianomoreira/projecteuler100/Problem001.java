package com.github.adrianomoreira.projecteuler100;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Problem001 {

    public static int multiplesOf3And5(int number) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }
        Integer sum = 0;
        for (Integer multiple : multiples) {
            sum += multiple;
        }
        return sum;
    }

    public static int multiplesOf3And5fp(int number) {
        IntPredicate isMultiplesOf3Or5 = (value) -> value % 3 == 0 || value % 5 == 0;
        return IntStream.range(1, number)
                .filter(isMultiplesOf3Or5)
                .reduce(Integer::sum)
                .getAsInt();
    }

}
