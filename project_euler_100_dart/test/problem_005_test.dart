import 'package:flutter_test/flutter_test.dart';
import 'package:project_euler_100_dart/problem_005.dart';

void main() {
  test('smallestMult(5) should return 60.', () {
    expect(smallestMult(5), 60);
  });
  test('smallestMult(7) should return 420', () {
    expect(smallestMult(7), 420);
  });
  test('smallestMult(10) should return 2520', () {
    expect(smallestMult(10), 2520);
  });
  test('smallestMult(13) should return 360360', () {
    expect(smallestMult(13), 360360);
  });
  test('smallestMult(20) should return 232792560', () {
    expect(smallestMult(20), 232792560);
  });
}
