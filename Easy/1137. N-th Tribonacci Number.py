class Solution:
    def tribonacci(self, n: int) -> int:
        if n==0:
            return 0
        l = [0,1,1]
        s = (n*2)-1
        a,b,c = 0,1,1
        res = 0
        while(len(l)<s):
            d = a+b+c
            l.append(d)
            a = b
            b = c
            c = d
            s-=1
        return l[-1]
        