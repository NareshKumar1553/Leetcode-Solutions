class Solution {
    int check(int n,int c){
        if(n%3 != 0){
            int a = n%3;
            if(a%2 == 0){
                return check(n+1,c+1);
            }
            else{
                return check(n-1,c+1);
            }  
        }
        return c;
    }
    public int minimumOperations(int[] n) {
        int res = 0;
        for(int i=0;i<n.length;i++){
            res += check(n[i],0);
        }
        return res;
    }
}