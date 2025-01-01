package Easy;

import java.util.Scanner;

public class RomantoInteger {
	private static int value(char r) {
		 if (r == 'I')   
		      return 1;   
		    if (r == 'V')   
		      return 5;   
		    if (r == 'X')   
		      return 10;   
		    if (r == 'L')   
		      return 50;   	
		    if (r == 'C')   
		      return 100;   
		    if (r == 'D')   
		      return 500;   
		    if (r == 'M')   
		      return 1000;
		return -1;
	}
	private static int romantoInt(String s) {
		int total = 0;
		for(int i=0;i<s.length();i++) {
			int a = value(s.charAt(i));
			if(i+1 < s.length()) {
				int b = value(s.charAt(i+1));
				if(a>=b) {
					total += a;
				}
				else {
					total -= a;
				}
			}
			else {
				total += a;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(romantoInt(str));
	}
}
