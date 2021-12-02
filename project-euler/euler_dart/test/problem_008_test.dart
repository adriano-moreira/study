import 'package:test/test.dart';
import 'package:euler_dart/problem_008.dart';

void main() {
  test('largestProductinaSeries(4) should return 5832.', () {
    expect(largestProductinaSeries(4), 5832);
  });
  test('largestProductinaSeries(13) should return 23514624000.', () {
    expect(largestProductinaSeries(13), 23514624000);
  });
}
