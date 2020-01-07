import 'package:flutter_test/flutter_test.dart';
import 'package:project_euler_100_dart/problem_004.dart';

void main(){
  test("largestPalindromeProduct(2) should return 9009", () {
    expect(largestPalindromeProduct(2), 9009);
  });
  test("largestPalindromeProduct(2) should return 9009", () {
    expect(largestPalindromeProduct(3), 906609);
  });
}

