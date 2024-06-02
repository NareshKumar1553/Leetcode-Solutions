class Solution {
    public int countTestedDevices(int[] bp) {
        int res = 0;
        for(int i=0;i<bp.length;i++){
            if(bp[i]>0){
                res++;
                for(int j=i+1;j<bp.length;j++){
                    if(bp[j]>0){
                        bp[j]--;
                    }
                }
            }
        }
        return res;
    }
}