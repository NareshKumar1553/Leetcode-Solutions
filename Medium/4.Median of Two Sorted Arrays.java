//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.


package Medium;

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        double res = 0.0;
        int c[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i] = a[i];
        }
        int k = a.length;
        for(int i=0;i<b.length;i++){
            c[k] = b[i];
            k++;
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        int mid = c.length/2;
        if(c.length%2 == 0){
            res = (double)(c[mid]+c[mid-1])/2;
        }else{
            res = (double)c[mid];
        }
        return res;
    }

}