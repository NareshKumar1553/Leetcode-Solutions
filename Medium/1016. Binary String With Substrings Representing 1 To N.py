class Solution:
    def queryString(self, s: str, n: int) -> bool:
        for i in range(1,n+1):
            a = str(bin(i)).split('b')[1]
            if a not in s:
                return False
        return True
        