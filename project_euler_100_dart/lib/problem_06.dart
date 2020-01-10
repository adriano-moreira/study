int square(n) => n * n;

int sumSquareDifference(int n) {
  int sum = 0;
  int sumSquare = 0;
  for (int i = 1; i <= n; i++) {
    sum += i;
    sumSquare += square(i);
  }
  return square(sum) -sumSquare;
}
