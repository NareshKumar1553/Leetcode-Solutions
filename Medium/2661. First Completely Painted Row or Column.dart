class Solution {
  int firstCompleteIndex(List<int> arr, List<List<int>> mat) {
    final m = mat.length, n = mat[0].length;
    final col = List.filled(n, 0); // column
    final row = List.filled(m, 0); // row
    final pos = List.generate(arr.length + 1, (_) => (0, 0)); // posisions of the number in the arr
    // fill the 'pos'
    for (int r = 0; r < m; r++){
        for (int c = 0; c < n; c++){
            pos[mat[r][c]] = (r, c);
        }
    }
    // count row and colums
    for (int i = 0; i < arr.length; i++){
        final (r, c) = pos[arr[i]];
        if (++row[r] == n) return i;
        if (++col[c] == m) return i;
    }
    return 0;
  }
}