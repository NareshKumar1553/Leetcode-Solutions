class Solution {
  List<int> eventualSafeNodes(List<List<int>> graph) {
    int n = graph.length;
    List<int> color = List.filled(n, 0);
    bool dfs(int node) {
        if (color[node] > 0) {
            return color[node] == 2;
        }
        color[node] = 1;
        for (int neighbor in graph[node]) {
            if (!dfs(neighbor)) {
                return false;
            }
        }
        color[node] = 2; 
        return true;
    }
    List<int> safeNodes = [];
    for (int i = 0; i < n; i++) {
        if (dfs(i)) {
            safeNodes.add(i);
        }
    }
    return safeNodes;
    }
}