class Solution {
  int minimizeXor(int num1, int num2) {
  // Count the number of set bits in num2
  int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
      count += n & 1;
      n >>= 1;
    }
    return count;
  }

  int num2SetBits = countSetBits(num2);
  int x = 0;

  // Step 1: Use bits from num1, starting from the most significant
  for (int i = 31; i >= 0 && num2SetBits > 0; i--) {
    if ((num1 & (1 << i)) != 0) {
      x |= (1 << i); // Add this bit to x
      num2SetBits--; // One less bit needed
    }
  }

  // Step 2: If we still need more set bits, use the smallest available bits
  for (int i = 0; i < 32 && num2SetBits > 0; i++) {
    if ((x & (1 << i)) == 0) {
      x |= (1 << i); // Add this bit to x
      num2SetBits--; // Decrease required bit count
    }
  }

  return x; // And x is ready to shine!
}

}