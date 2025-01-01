package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MatrixRoeSum {
	public static void main(String[] args) {
		int mat[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
		int k = 2;
		System.out.println(Arrays.toString(MatrixRow(mat,k))); 
	}

	private static int[] MatrixRow(int a[][],int k) {
		int $res[] = new int[k];
		int min =99999;
		int n=0;
		List<Integer> ar = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum += a[i][j];
			}
			ar.add(sum);
		}
		//System.out.println(ar);
		for(int i=0;i<k;i++) {
			int f = ar.indexOf(Collections.min(ar));
			ar.set(f, Integer.MAX_VALUE);
			$res[i] = f;
		}
		return $res;	
	}
}
