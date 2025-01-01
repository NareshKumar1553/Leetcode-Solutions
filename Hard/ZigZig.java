package hard;

import java.util.Scanner;

public class ZigZig {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int k = sc.nextInt();
		String s = "ABCDEFGHIJ";
		int k = 3;
		int x=0,y=k;
		char a[][] = new char[k][k*2];
		ZigZag(s,a, x, y,k);
	}
	private static void ZigZag(String s,char a[][],int x,int y,int k) {
		int l=0,index=0;
		for(int i=0;i<k;i++) {
			a[i][x] = s.charAt(l);
			System.out.println(i+" "+x);
			l++;
			index++;
		}
		int i=x,j=index;
		l-=1;
		
		while(i<k && j<s.length()) {
			j--;
			a[j][i] = s.charAt(l);
			System.out.println(a[j][i]);
			i++;
			l++;
		}
		x=j;
		y=i-1;
		System.out.println("No "+s.charAt(l)+" "+l);
		if(l==s.length()-1) {
			System.out.println("Finish");
			display(a);
		}
		else {
			System.out.println();
			System.out.println(x+" "+y);
			ZigZag(s.substring(l-1,s.length()),a,2,0,k);
		}
	}
	private static void display(char a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
