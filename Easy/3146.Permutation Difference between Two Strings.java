class Solution {
    public int findPermutationDifference(String s, String t) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int j = t.indexOf(s.charAt(i));
            res += Math.abs(i-j);
        }
        return res;
    }
}