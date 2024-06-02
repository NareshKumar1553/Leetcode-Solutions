//Write a function that reverses a string. The input string is given as an array of characters s.

class Solution {
    public void reverseString(char[] s) {
        char []a = Arrays.copyOf(s,s.length);
        int k=0;
        for(int i=s.length-1;i>=0;i--){
           s[k] = a[i];
            k++;
        }
    }
}