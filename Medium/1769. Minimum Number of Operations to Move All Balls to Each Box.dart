class Solution {
  List<int> minOperations(String boxes) {
    final b = boxes.split('').map((box) => int.parse(box)).toList();
    final res = List.filled(boxes.length, 0);
    int balls = 0;
    int cur = 0;
    for (int i = 0; i < b.length; i++){
        cur += balls;
        res[i] += cur;
        balls += b[i];
    }
    balls = 0;
    cur = 0;
    for (int i = b.length - 1; i >= 0; i--){
        cur += balls;
        res[i] += cur;
        balls += b[i];
    }
    return res;
  }
}