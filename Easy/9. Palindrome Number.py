class Solution:
    def isPalindrome(self, x: int) -> bool:
        a = str(x)
        return a == a[::-1]