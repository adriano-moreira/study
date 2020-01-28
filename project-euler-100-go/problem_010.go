package main

func primeSummation(n int) int {
	sum := 0

	for i := 2; i < n; i++ {
		if isPrime(i) {
			sum += i
		}
	}

	return sum
}
