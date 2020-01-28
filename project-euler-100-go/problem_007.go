package main

import "math"

func isPrime(n int) bool {
	root := int(math.Sqrt(float64(n)))
	for i := 2; i <= root; i++ {
		if n%i == 0 {
			return false
		}
	}
	return true
}

func nthPrime(n int) int {
	prime := 2
	count := 1
	for currentNumber := 3; count < n; currentNumber++ {
		if isPrime(currentNumber) {
			count++
			prime = currentNumber
		}
	}
	return prime
}
