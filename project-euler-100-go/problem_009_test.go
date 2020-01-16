package main

import "testing"

func TestSpecialPythagoreanTriplet(t *testing.T) {
	expect(specialPythagoreanTriplet(1000), 31875000, t)
	expect(specialPythagoreanTriplet(24), 480, t)

	valid := []int{49920, 55080, 60000}
	response := specialPythagoreanTriplet(120)
	if !contains(valid, response) {
		t.Errorf("resposnse %d not in %v", response, valid)
	}
}

func contains(values []int, value int) bool {
	for _, i := range values {
		if i == value {
			return true
		}
	}
	return false
}
