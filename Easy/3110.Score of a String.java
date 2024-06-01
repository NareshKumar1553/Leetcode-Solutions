/*You are given a string s. 
The score of a string is defined as the sum of the 
absolute difference between the ASCII values of adjacent characters.
Return the score of s.*/


class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        for(int i=0;i<s.length()-1;i++){
            res += Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.scoreOfString("abc"));
    }
}