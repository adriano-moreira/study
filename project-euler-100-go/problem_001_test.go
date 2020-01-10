package main

import "testing"

func expect(current int, expected int,t *testing.T){
	if  current != expected  {
		t.Errorf("current: %v !=  expected: %v", current, expected)
	}
}

func TestMultiplesOf3and5(t *testing.T) {
	expect(multiplesOf3and5(1000), 233168, t)
	expect(multiplesOf3and5(49), 543, t)
	expect(multiplesOf3and5(19564), 89301183, t)
	expect(multiplesOf3and5(8456), 16687353, t)
}

