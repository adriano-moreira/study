package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Problem009Test {

    @DisplayName("specialPythagoreanTriplet(1000) should return 31875000")
    @Test
    public void test100() {
        Assertions.assertEquals(31875000, Problem009.specialPythagoreanTriplet(1000));
    }

    @DisplayName("specialPythagoreanTriplet(24) should return 480")
    @Test
    public void test24() {
        Assertions.assertEquals(480, Problem009.specialPythagoreanTriplet(24));
    }

    @DisplayName("specialPythagoreanTriplet(120) should return 49920, 55080 or 60000")
    @Test
    public void test120() {
        var response = Problem009.specialPythagoreanTriplet(120);
        List<Integer> valid = List.of(49920, 55080, 60000);
        Assertions.assertTrue(valid.contains(response));
    }
}
