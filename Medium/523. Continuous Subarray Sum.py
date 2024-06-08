class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        pref=0
        dic={0:0}
        for i in range(len(nums)):
            pref=pref+nums[i]
            m = pref%k
            if dic.get(m,-1)!=-1:
                if i-dic[m]+1>=2:
                    return 1
            else:
                dic[m]=i+1

        return 0

        