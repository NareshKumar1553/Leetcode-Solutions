package Easy;

import java.util.Scanner;

public class ExcelColumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(convertToTitle(a));
	}
	 public static String convertToTitle(int columnNumber) {
		 StringBuilder sb = new StringBuilder();
		 while(columnNumber>0) {
			 --columnNumber;
			 int f = columnNumber%26;
			 columnNumber /= 26;
			 sb.append((char)('A'+f));
		 }
		 sb.reverse();
	        return sb.toString();
	    }
}
