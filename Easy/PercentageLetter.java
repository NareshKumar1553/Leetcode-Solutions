package Easy;

import java.util.Scanner;

public class PercentageLetter {
	public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			String a = sc.next();
//			char b = sc.next().charAt(0);
		String a = "fkkbar";
		char b = 'o';
			System.out.println(percentageLetter(a, b));
			
	}
	public static int percentageLetter(String s, char letter) {
        int n=0;
        for(int i=0;i<s.length();i++){
            if(letter == s.charAt(i)){
                n++;
            }
        }
        System.out.println(n);
        n = n*100/s.length();
        return n;
    }
}
