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
