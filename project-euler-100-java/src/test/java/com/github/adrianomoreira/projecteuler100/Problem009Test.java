package com.github.adrianomoreira.projecteuler100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem009Test {
    @DisplayName("specialPythagoreanTriplet(24) should return 480")
    @Test
    public void test24(){
        Assertions.assertEquals(480, Problem009.specialPythagoreanTriplet(24));
    }

//    specialPythagoreanTriplet(1000) should return 31875000.
//    specialPythagoreanTriplet(24) should return 480.
//    specialPythagoreanTriplet(120) should return 49920, 55080 or 60000

}
