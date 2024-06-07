class Solution:
    def replaceWords(self, d: List[str], sentence: str) -> str:
        s = sentence.split()
        res = ""
        d.sort()
        for i in s:
            flag = True
            for j in d:
                if j[0] == i[0] and j in i and i.index(j)==0:
                    res += j+" "
                    flag = False
                    break
            if(flag):
                res += i+" "       
        return res[0:len(res)-1]