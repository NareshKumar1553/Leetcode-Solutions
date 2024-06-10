class Solution:
    def maxDistance(self, c: List[int]) -> int:
        a = []
        for i in range(0,len(c)):
            for j in range(i+1,len(c)):
                if c[i]!=c[j]:
                    a.append(abs(j-i))
        return max(a)