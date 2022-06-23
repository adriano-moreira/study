/// https://www.hackerrank.com/challenges/similar-strings/problem
int countSimilar({
  required int n,
  required int q,
  required String S,
  required int li,
  required int ri,
}) {
  int substringLen = (ri + 1) - li;
  if (substringLen == 1) {
    return n;
  }

  print('substringLen: $substringLen');
  print('');

  final base = S.substring(li - 1, ri);
  print('substring base: $base');
  final substrings = <String>[];
  for (var i = 0; i <= n; i++) {
    final end = i + substringLen;
    if (end > n) {
      continue;
    }
    substrings.add(S.substring(i, end));
  }

  print('all substrings: $substrings');
  final similars = substrings.where((sub) => base.isSimilar(sub,q)).toList();

  print('similars: $similars');

  return similars.length;
}

extension on String {
  bool isSimilar(String other, int q) {
    if (length != other.length) {
      return false;
    }
    String a = this;
    String b = other;

    var totalEqual = 0;
    var totalNotEqual = 0;
    var total = 0;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (i == j) continue;
        if (i > j) continue;
        print("i: $i j: $j");
        total++;
        if (a[i] == a[j] && b[i] == b[j]) {
          totalEqual++;
        }
        if (a[i] != a[j] && b[i] != b[j]) {
          totalNotEqual++;
        }
      }
    }

    return totalNotEqual + totalEqual == total && totalEqual < 2;
  }
}
