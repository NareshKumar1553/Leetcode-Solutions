class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s)==1:
            return 1
        upp = {}
        low = {}
        for i in s:
            if i.isupper():
                if i in upp:
                    upp[i] += 1
                else:
                    upp[i] = 1
            else:
                if i.islower():
                    if i in low:
                        low[i] += 1
                    else:
                        low[i] = 1

        oddCount = -1
        
        for i in low.values():
            if i%2 != 0:
                oddCount+=1

        for i in upp.values():
            if i%2 != 0:
                oddCount+=1

        if(oddCount == -1):
            return len(s)
        return len(s)-oddCount

        