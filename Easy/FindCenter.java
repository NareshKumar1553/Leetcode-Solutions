package Easy;

import java.util.Arrays;

public class FindCenter {
	public static void main(String[] args) {
		int a[][] = {{1,2},{5,1},{1,3},{1,4}};
		findCenter(a);
	}
	public static void findCenter(int[][] a) {
        int i = a[0].length;
        int j = a.length;
        int b[] = new int[i*j];
        int k = 0;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
                b[k] = a[i][j];
                k++;
            }
        }
        int max = 0;
        for(i=0;i<b.length;i++) {
        	if(max<b[i]) {
        		max = b[i];
        	}
        }
        int c[] = new int[max+1];
        for(i=0;i<b.length;i++) {
        	c[b[i]]++;
        }
        max =0;
        int res = -1;
        for(i=0;i<c.length;i++) {
        	if(max<c[i]) {
        		max = c[i];
        		res = i;
        	}
        }
        System.out.println(Arrays.toString(b));
        
        System.out.println(Arrays.toString(c));
        System.out.println("Max "+res);
        System.out.println(res);
    }
}
