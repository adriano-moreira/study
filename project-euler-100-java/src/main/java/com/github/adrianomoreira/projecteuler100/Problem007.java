package com.github.adrianomoreira.projecteuler100;

public class Problem007 {

    private static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int value) {
        int nth = 1;
        int currentNumber = 2;
        while (nth < value){
            if( isPrime(++currentNumber)) {
                nth++;
            }
        }
        return currentNumber;
    }

}
