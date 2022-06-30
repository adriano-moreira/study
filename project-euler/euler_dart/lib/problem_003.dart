int largestPrimeFactor(int n) {
  int largest = 1;
  int current = 2;
  int end = n;
  while (current <= end) {
    if (end % current == 0) {
      largest = current;
      end = (end / current).truncate();
    } else {
      current++;
    }
  }
  return largest;
}
