import 'package:flutter_test/flutter_test.dart';
import 'package:project_euler_100_dart/problem_06.dart';

void main() {
  test("sumSquareDifference(10) should return 2640", () {
    expect(sumSquareDifference(10), 2640);
  });
  test("sumSquareDifference(20) should return 41230", () {
    expect(sumSquareDifference(20), 41230);
  });
  test("sumSquareDifference(100) should return 25164150", () {
    expect(sumSquareDifference(100), 25164150);
  });
}
