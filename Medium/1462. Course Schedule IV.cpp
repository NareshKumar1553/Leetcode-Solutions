class Solution {
public:
    vector<bool> checkIfPrerequisite(int numCourses, vector<vector<int>>& prerequisites, vector<vector<int>>& queries) {
    vector<vector<bool>> isPrerequisite(numCourses, vector<bool>(numCourses, false));

    for (const auto& prerequisite : prerequisites) {
        isPrerequisite[prerequisite[0]][prerequisite[1]] = true;
    }

    for (int k = 0; k < numCourses; ++k) {
        for (int i = 0; i < numCourses; ++i) {
            for (int j = 0; j < numCourses; ++j) {
                isPrerequisite[i][j] = isPrerequisite[i][j] || (isPrerequisite[i][k] && isPrerequisite[k][j]);
            }
        }
    }

    vector<bool> answer;
    for (const auto& query : queries) {
        answer.push_back(isPrerequisite[query[0]][query[1]]);
    }

    return answer;
}

   
};