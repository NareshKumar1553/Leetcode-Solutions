class Solution:
    def longestPalindrome(self, s: str) -> str:
        def isPalindrome(s):
            return s==s[::-1]
        if(len(s)==1):
            return s
        if(isPalindrome(s)):
            return s
        res=''
        l=[]
        for i in range(0,len(s)):
            for j in range(i+1,len(s)):
                a = s[i:j+1]
                if(isPalindrome(a)):
                    l.append(a)
        l.sort(key=lambda s: len(s))
        if(len(l)==0):
            return s[0]
        return l[-1]
        