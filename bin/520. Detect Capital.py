class Solution:
    def detectCapitalUse(self, w: str) -> bool:
        upp = 0
        low = 0
        for i in w:
            if i.isupper():
                upp += 1
            elif i.islower():
                low += 1
        if w[0].isupper() and len(w)-1 == low:
            return True
        elif len(w) == upp or len(w) == low:
            return True
        else:
            return False
        