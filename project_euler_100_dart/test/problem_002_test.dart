import 'package:flutter_test/flutter_test.dart';

import 'package:project_euler_100_dart/problem_002.dart';

void main() {
  test("fiboEvenSum(10) should return 44", () {
    expect(fiboEvenSum(10), 44);
  });
  test("fiboEvenSum(18) should return 3382", () {
    expect(fiboEvenSum(18), 3382);
  });
  test("fiboEvenSum(23) should return 60696", () {
    expect(fiboEvenSum(23), 60696);
  });
  test("fiboEvenSum(43) should return 350704366", () {
    expect(fiboEvenSum(43), 350704366);
  });
}
