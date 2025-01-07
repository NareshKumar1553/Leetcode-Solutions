class Solution:
    def numJewelsInStones(self, j: str, s: str) -> int:
        c = {}
        res = 0
        for i in s:
            if i in c:
                c[i] += 1
            else:
                c[i] = 1
        for i in j:
            try:
                res += c[i]
            except:
                pass
        print(res)
        return res
        