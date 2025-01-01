/**
 * 
 */
package Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author naresh Problem Number 2160
 *
 */
public class MinSumFourDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(minSum(n));
	}
	private static int minSum(int n) {
		String z = n+"";
		boolean flag = false;
		int c = 0;
		int sum =0;
		//Integer.MAX_VALUEx
		int a[] = new int[z.length()];
		for(int i=0;i<a.length;i++) {
			if(z.charAt(i) != '0') {
				a[i] = Integer.parseInt(z.charAt(i)+"");
			}
			else {
				a[i] = Integer.MAX_VALUE;
				c++;
				flag = true;
			}
		}
		Arrays.sort(a);
		if(flag) {
			if(c==1) {
				String x = a[0]+""+a[1];
				String y = ""+a[a.length-2];
				sum = Integer.parseInt(x)+Integer.parseInt(y);
			}
			else if(c==2) {
				sum = a[0]+a[1];
			}
			else if(c==3) {
				sum = a[0];
			}
			else {
				sum = 0;
			}
		}
		else {
			String x = a[0]+""+a[a.length-2];
			String y = a[1]+""+a[a.length-1];
			sum = Integer.parseInt(x)+Integer.parseInt(y);
		}
		//System.out.println(Arrays.toString(a));
		return sum;
	}

}
