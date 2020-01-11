package main

func isPrime(n int) bool {
	for i := 2; i < n; i++ {
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

//nthPrime(6) should return 13.
//nthPrime(10) should return 29.
//nthPrime(100) should return 541.
//nthPrime(1000) should return 7919.
//nthPrime(10001) should return 104743.
