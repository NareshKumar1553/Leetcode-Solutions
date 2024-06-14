class Solution:
    def minIncrementForUnique(self, n: List[int]) -> int:
        n.sort()
        c=0
        for i in range(1,len(n)):
            if n[i] <= n[i-1]:
                s = n[i-1]+1 - n[i]
                c += s
                n[i] = n[i-1]+1
        return c
