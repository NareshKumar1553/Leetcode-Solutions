class Solution {
    private boolean isPrefixAndSuffix(String a, String b){
    	int firstIndex = b.indexOf(a);
    	int secondIndex = b.indexOf(a, (b.length()-a.length()));
    	if(firstIndex == 0 && secondIndex != -1) {
    		return true;
    	}
        return false;
    }
    
    public int countPrefixSuffixPairs(String[] w) {
        int res = 0;
        for(int i=0;i<w.length;i++){
            for(int j=0;j<w.length && i!=j ;j++){
                if(isPrefixAndSuffix(w[j],w[i])){
                    res++;
                }
            }
        }
        
        return res;
    }
}