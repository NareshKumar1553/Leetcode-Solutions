class Solution:
    def findIntersectionValues(num1,num2):
        a = set(num1)
        b = set(num2)
        res = [0,0]
        c=0
        for i in b:
            for j in num1:
                if i == j:
                    c+=1
        res[0] = c
        c=0
        for i in a:
            for j in num2:
                if i == j:
                    c+=1
        res[1] = c
        return res    