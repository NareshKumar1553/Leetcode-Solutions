class Solution {
public:
    vector<int> lexicographicallySmallestArray(vector<int>& nums, int limit) {
        int n=nums.size();
        vector<int>ans(n);
        vector<pair<int,int>>temp;
        for(int i=0;i<n;i++){
            temp.push_back({nums[i],i});
        }
        sort(temp.begin(),temp.end());
        vector<vector<pair<int,int>>>groups;
        int i=0;
        while(i<n){
            vector<pair<int,int>>group;
            group.push_back(temp[i]);
            i++;
            while(i<n and temp[i].first-temp[i-1].first<=limit){
                group.push_back(temp[i]);
                i++;
            }
            groups.push_back(group);
        }
        for(int i=0;i<groups.size();i++){
            priority_queue<int>pq1,pq2;
            for(int j=0;j<groups[i].size();j++){
                pq1.push(groups[i][j].first);
                pq2.push(groups[i][j].second);
            }
            while(!pq1.empty()){
                ans[pq2.top()]=pq1.top();
                pq1.pop();
                pq2.pop();
            }
        }
        return ans;
    }
};