class Solution:
    def commonChars(self, w: List[str]) -> List[str]:
        res = []
        a = w[0]
        for i in a:
            c=1
            for j in range(1,len(w)):
                if i in w[j]:
                    c += 1
                    w[j] = w[j].replace(i,'',1)
                else:
                    break
            if c == len(w):
                res.append(i)
        return res
        