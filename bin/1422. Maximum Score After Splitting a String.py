class Solution:
    def maxScore(self, s: str) -> int:
        l=[]
        r=[]
        p=[]
        for i in range(1,len(s)):
            r.append(s[i:len(s)])
            l.append(s[0:i])
        for i in range(len(r)):
            a = l[i].count('0')+r[i].count('1')
            p.append(a)
        return max(p)
        