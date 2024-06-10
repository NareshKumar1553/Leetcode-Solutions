class Solution {
    public int heightChecker(int[] h) {
        int a[] = Arrays.copyOf(h,h.length);
        Arrays.sort(a);
        int c = 0;
        for(int i=0;i<h.length;i++){
            if(a[i] != h[i]){
                c++;
            }
        }
        return c;
    }
}