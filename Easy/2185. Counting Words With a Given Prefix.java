class Solution {
    private boolean isPrefix(String src, String pref){
        return src.indexOf(pref) == 0?true:false;
    }
    public int prefixCount(String[] words, String pref) {
        int c=0;
       for(String w:words){
            c += isPrefix(w,pref)?1:0;
       }
        return c;
    }
}