class Solution {
  bool canBeValid(String s, String locked) {
    if (s.length % 2 != 0) {
      return false;
    }
    int openCount = 0;
    int flexibleCount = 0;

    for (int i = 0; i < s.length; i++) {
      if (locked[i] == '1') {
        openCount += s[i] == '(' ? 1 : -1;
      } else {
        flexibleCount++;
      }

      if (openCount + flexibleCount < 0) {
        return false; 
      }
    }
    openCount = 0;
    flexibleCount = 0;
    for (int i = s.length - 1; i >= 0; i--) {
      if (locked[i] == '1') {
        openCount += s[i] == ')' ? 1 : -1;
      } else {
        flexibleCount++;
      }
      if (openCount + flexibleCount < 0) {
        return false;
      }
    }
    return true;
  }
}