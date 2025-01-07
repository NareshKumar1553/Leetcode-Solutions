class Solution:
    def countOperations(self, a: int, b: int) -> int:
        c = 0
        while(a!=0 and b!=0):
            if(a<b):
                b = b-a
            else:
                a = a-b
            c+=1
        return c
        