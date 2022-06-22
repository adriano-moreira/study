import 'package:harckerrank_challenges_dart/similar_strings.dart';
import 'package:test/test.dart';

void main() {
  test('should work', () {
    int _compute(li, ri) {
      print('testing Li:$li, Ri:$ri');
      return countSimilar(
        n: 8,
        q: 4,
        S: 'giggabaj',
        li: li,
        ri: ri,
      );
    }

    expect(_compute(1, 1), 8);
    expect(_compute(1, 2), 6);
    expect(_compute(1, 3), 2);
    expect(_compute(2, 4), 1);
  });
}
