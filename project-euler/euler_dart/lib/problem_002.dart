int fiboEvenSum(int value) {
  final seq = [1, 2];
  while (seq.length < value) {
    seq.add(seq[seq.length - 1] + seq[seq.length - 2]);
  }
  return seq.where((n) => n % 2 == 0).reduce((acc, cur) => acc + cur);
}
