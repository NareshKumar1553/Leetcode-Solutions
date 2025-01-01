package medium;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
			int a[] = {1,2,3,4,5,6,7};
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
			rotate(a);
			System.out.println(Arrays.toString(a));
			}
			System.out.println(Arrays.toString(a));
	}
	private static void rotate(int a[]) {
		int n = a.length; //4
		int temp = a[n-1];
		for(int i=1;i<=(n/2)+1;i++) {
			a[n-i] = a[n-1-i];
		}
		a[0] = temp;
	}

}
