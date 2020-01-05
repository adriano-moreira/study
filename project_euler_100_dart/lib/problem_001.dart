int multiplesOf3and5(int value) {
  return List<int>.generate(value, (i) => i)
    .where((n) => n % 3 == 0 || n % 5 == 0)
    .reduce((acc, cur) => acc + cur);
}
