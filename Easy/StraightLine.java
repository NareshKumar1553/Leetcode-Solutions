package Easy;

import java.util.Arrays;

//1232
public class StraightLine {
	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int x1=a[0][0],y1=a[0][1],x2=a[1][0],y2=a[1][1];
		for(int[] i:a) {
			int x = i[0],y=i[1];
			if((y-y1)*(x2-x1) != (y2-y1)*(x-x1)) {
				System.out.println("No");
			}
		}
		System.out.println("Yes");
	}
}
