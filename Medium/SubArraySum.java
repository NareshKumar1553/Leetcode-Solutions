package medium;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int required = 6;
		List<Integer> ar = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					sum+= a[k];
					if(sum == required) {
						ar.add(a[k]);
					}
					System.out.print(a[k]+" ");
				}
				System.out.println(sum);
				System.out.println();
			}
		}
		System.out.println(ar);
	}
}
