import 'package:test/test.dart';

import 'package:euler_dart/problem_003.dart';

void main() {
  test("largestPrimeFactor(2) should return 2", () {
    expect(largestPrimeFactor(2), 2);
  });
  test("largestPrimeFactor(5) should return 5", () {
    expect(largestPrimeFactor(5), 5);
  });
  test("largestPrimeFactor(7) should return 7", () {
    expect(largestPrimeFactor(7), 7);
  });
  test("largestPrimeFactor(13195) should return 29", () {
    expect(largestPrimeFactor(13195), 29);
  });
  test("largestPrimeFactor(600851475143) should return 6857", () {
    expect(largestPrimeFactor(600851475143), 6857);
  });
}
