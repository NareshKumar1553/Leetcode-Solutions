package Easy;

import java.util.Scanner;

public class RotateMatix {
	public static void main(String[] args) {
		int a[][] = {{ 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }};
		System.out.println("1.Clockwise\n2.Anticlockwise\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Original Matix\n");
		display(a);
		switch(n) {
		case 1:
			ClockWise(a);
			break;
		case 2:
			AntiClockWise(a);
			break;
		}
		System.out.println("Rotated Matix\n");
		display(a);
	}
	private static void display(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	private static void AntiClockWise(int a[][]) {
				int n = a[0].length;
				for(int i=0;i<n/2;i++) {
					for(int j=i;j<n-i-1;j++) {
						int temp = a[i][j];
						a[i][j] = a[j][n-1-i];
						a[j][n-1-i] = a[n-1-i][n-1-j];
						a[n-1-i][n-1-j] = a[n-1-j][i];
						a[n-1-j][i] = temp;
					}
				}
	}
	private static void ClockWise(int a[][]){
		int n = a[0].length;
		for(int i=0;i<n/2;i++) {
			for(int j=i;j<n-1-i;j++) {
				int temp = a[i][j];
				a[i][j] = a[n-1-j][i];
				a[n-1-j][i] = a[n-1-i][n-1-j];
				a[n-1-i][n-1-j] = a[j][n-1-i];
				a[j][n-1-i] = temp;
			}
		}
	}
}
