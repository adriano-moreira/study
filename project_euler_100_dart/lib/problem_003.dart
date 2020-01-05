int largestPrimeFactor(int value) {
  int prime = 2, max = 1;
  while (prime <= value) {
    if (value % prime == 0) {
      max = prime;
      value = (value / prime).truncate();
    } else
      prime++;
  }
  return max;
}
