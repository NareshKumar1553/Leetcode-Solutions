class Solution:
    def reverse(self, x: int) -> int:
        if(2147483647>=x and x>= -2147483648):
            print(True)
            if(x>0):
                a = str(x)
                a = a[::-1]
                x = int(a)
            elif(x<0):
                s = str(x)
                s = s[1:len(s)]
                s = s[::-1]
                x = int(s)
                x = -1*x
            else:
                return 0
        if(2147483647>=x and x>= -2147483648):
            return x
        else:
            return 0
        