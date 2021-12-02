import 'package:test/test.dart';
import 'package:euler_dart/problem_001.dart';

void main() {
  test("multiplesOf3and5(1000) should return 233168", () {
    expect(multiplesOf3and5(1000), 233168);
  });
  test("multiplesOf3and5(49) should return 543", () {
    expect(multiplesOf3and5(49), 543);
  });
  test("multiplesOf3and5(19564) should return 89301183", () {
    expect(multiplesOf3and5(19564), 89301183);
  });
  test("multiplesOf3and5(8456) should return 16687353", () {
    expect(multiplesOf3and5(8456), 16687353);
  });
}
