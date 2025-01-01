package Easy;

import java.util.Scanner;

public class UndercoreReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String c[] = s.split("_");
		String res = c[0]+"_"+rev(c[1]);
		System.out.println(res);
	}

	private static String rev(String a) {
		StringBuilder sb = new StringBuilder(a);
		sb.reverse();
		return sb.toString();
	}
}
