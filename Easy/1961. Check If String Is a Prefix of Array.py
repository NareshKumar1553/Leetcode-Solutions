def isPrefixString(s,w):
    a = -1
    for i in range(len(w)):
        try:
            b = s.index(w[i])
        except:
            if(len(w)-1 != i):
                return False
        if b<a or b==a:
            return False
    return True
s = "iloveleetcode"
w = ["apples","i","love","leetcode"]
print(isPrefixString(s,w))
