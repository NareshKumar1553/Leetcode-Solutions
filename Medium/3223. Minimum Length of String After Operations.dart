class Solution {
  int minimumLength(String s) {
    Map<String, List<int>> letters = {};
    int res = 0;
    for (int i=0; i<s.length; i++) {
        if (letters[s[i]] == null) {
            letters[s[i]] = [];
        }
        letters[s[i]]!.add(i);
        if (letters[s[i]]!.length == 3) {
            letters[s[i]]!.removeAt(0);
            letters[s[i]]!.removeAt(1);
        }
    }
    for (String key in letters.keys) {
        res += letters[key]!.length;
    }
    return res;
  }
}