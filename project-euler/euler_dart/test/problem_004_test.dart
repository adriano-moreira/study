import 'package:test/test.dart';
import 'package:euler_dart/problem_004.dart';

void main() {
  test("largestPalindromeProduct(2) should return 9009", () {
    expect(largestPalindromeProduct(2), 9009);
  });
  test("largestPalindromeProduct(2) should return 9009", () {
    expect(largestPalindromeProduct(3), 906609);
  });
}
