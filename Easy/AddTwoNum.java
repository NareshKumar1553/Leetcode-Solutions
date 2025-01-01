package Easy;
import java.util.*;
class Listode {
	     int val;
	     Listode next;
	     Listode() {}
	     Listode(int val) { this.val = val; }
	     Listode(int val, Listode next) { this.val = val; this.next = next; }
	 }
public class AddTwoNum {
	public static void main(String[] args) {
		String r = "kill_u_l0ve";
		String f = "";
		String []c = r.split("[-_]");
		for(int i=0;i<c.length;i++) {
			f+=Capitalised(c[i]);
		}
		System.out.println(f);
	}
	private static String Capitalised(String r) {
		String f = r.charAt(0)+"";
		f = f.toUpperCase();
		for(int i=1;i<r.length();i++) {
			f += r.charAt(i);
		}
		return f;
	}
	
	
}
