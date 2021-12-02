import 'dart:math';

largestPalindromeProduct(int value) {
  final min = pow(10, value - 1) - 1;
  final max = pow(10, value) - 1;

  num largest = 0;

  for (var x = min; x <= max; x++) {
    for (var y = min; y <= max; y++) {
      final num product = x * y;
      if (product > largest) {
        final normal = product.toString();
        final reversed = normal.split('').reversed.join('');
        if (reversed == normal) {
          largest = product;
        }
      }
    }
  }

  return largest;
}
