package main

import "testing"

func TestNthPrime(t *testing.T) {
	expect(nthPrime(6), 13, t)
	expect(nthPrime(10), 29, t)
	expect(nthPrime(100), 541, t)
	expect(nthPrime(1000), 7919, t)
	expect(nthPrime(10001), 104743, t)
}
