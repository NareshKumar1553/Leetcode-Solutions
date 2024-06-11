class Solution:
    def relativeSortArray(self, a: List[int], b: List[int]) -> List[int]:
        res = []
        for i in b:
            for j in range(0,len(a)):
                if i == a[j]:
                    res.append(i)
        a.sort()
        temp = []
        for i in a:
            if i not in res:
                temp.append(i)
        return res+temp
        