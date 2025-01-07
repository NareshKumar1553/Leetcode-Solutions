class Solution {
    public List<String> stringMatching(String[] w) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<w.length;i++){
            for(int j=0;j<w.length;j++){
                if(i!=j && w[i].contains(w[j]) && !res.contains(w[j])){
                    res.add(w[j]);
                }
            }
        }
        return res;
    }
}