package main

import (
	"math"
)

func isPythagorean(a int, b int, c int) bool {
	return math.Pow(float64(a), 2)+math.Pow(float64(b), 2) == math.Pow(float64(c), 2)
}

func specialPythagoreanTriplet(n int) int {
	for c := n - 2; c > 0; c-- {
		for b := c - 1; b > 0; b-- {
			for a := b - 1; a > 0; a-- {
				if a+b+c == n {
					if isPythagorean(a, b, c) {
						return a * b * c
					}
				}
			}
		}
	}
	return 0
}
