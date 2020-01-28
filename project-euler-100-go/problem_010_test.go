package main

import "testing"

func TestPrimeSummation(t *testing.T) {
	expect(primeSummation(17), 41, t)
	expect(primeSummation(2001), 277050, t)
	expect(primeSummation(140759), 873608362, t)
	expect(primeSummation(2000000), 142913828922, t)
}
