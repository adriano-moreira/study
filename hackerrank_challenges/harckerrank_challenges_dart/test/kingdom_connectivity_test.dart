import 'package:harckerrank_challenges_dart/kingdom_connectivity.dart';
import 'package:test/test.dart';

void main() {
  test('shold works', () {
    final r1 = countPaths(5, [
      [1, 2],
      [2, 4],
      [2, 3],
      [3, 4],
      [4, 5],
    ]);
    expect(r1, 2);

    final r2 = countPaths(5, [
      [1, 2],
      [4, 2],
      [2, 3],
      [3, 4],
      [4, 5],
    ]);
    expect(r2, null);
  });
}
