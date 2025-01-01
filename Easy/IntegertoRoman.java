package Easy;

import java.util.Scanner;

public class IntegertoRoman {
	private static String Int2Roman(int a) {
		String roman="";
		int num[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
		String rom[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
		for(int i=0;i<num.length;i++) {
			while(a >= num[i]) {
				a -= num[i];
				roman += rom[i];
			}
		}
		return roman;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		System.out.print(Int2Roman(s));
	}
}
