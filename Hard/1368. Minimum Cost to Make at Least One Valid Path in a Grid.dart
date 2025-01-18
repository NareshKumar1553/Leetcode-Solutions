import 'dart:collection';

class Solution {
  int minCost(List<List<int>> grid) {
    int m = grid.length;
    int n = grid[0].length;
    List<List<int>> cost = List.generate(
      m,
      (_) => List.filled(n, 1 << 30)
    );
    List<List<int>> directions = [
      [0, 1],  
      [0, -1], 
      [1, 0],  
      [-1, 0]
    ];
    Queue<List<int>> deque = Queue();
    cost[0][0] = 0;
    deque.addFirst([0, 0]);
    while (deque.isNotEmpty) {
      List<int> cell = deque.removeFirst();
      int i = cell[0], j = cell[1];
      for (int d = 0; d < 4; d++) {
        int ni = i + directions[d][0];
        int nj = j + directions[d][1];
        if (ni < 0 || ni >= m || nj < 0 || nj >= n) continue;
        int extra = (grid[i][j] == d + 1) ? 0 : 1;
        if (cost[i][j] + extra < cost[ni][nj]) {
          cost[ni][nj] = cost[i][j] + extra;
          if (extra == 0) {
            deque.addFirst([ni, nj]);
          } else {
            deque.addLast([ni, nj]);
          }
        }
      }
    }
    return cost[m - 1][n - 1];
  }
}