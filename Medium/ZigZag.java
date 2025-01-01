package medium;
import java.util.*;
public class ZigZag {
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int k=4;
		System.out.println(Zig(s,k));
	}
	private static String Zig(String a,int k) {
		List<String> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int x=0,y=k;
		for(int i=0;i<a.length();i++) {
			if(y>=a.length()) {
				break;
			}
			String p = a.substring(x,y);
			l.add(p);
			l.add(a.charAt(y)+"");
			y++;
			x = y;
			y = x+k;
		}
		List l1 = new ArrayList<>();
		//System.out.println(l1.add("sdsd"));
		int o[][] = new int[2][3];
		//o[0][0] = 9;
		//o[0][1] = 8;
		for(int i=0;i<o.length;i++) {
			for(int j=0;j<o[0].length;j++) {
				//int m = i;
				o[i][j] = j;
			}
		}
		for(int i=0;i<o.length;i++) {
			for(int j=0;j<o[0].length;j++) {
				System.out.print(o[i][j]+" ");
			}
			System.out.println();
		}
		return "";
	}
}
