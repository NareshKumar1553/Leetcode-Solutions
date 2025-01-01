package Easy;
import java.util.*;
public class StudentAttendanceII {

	public static void main(String[] args) {
		int n=2;
		System.out.println(checkRecord(n));
	}
	 public static int checkRecord(int n) {
		 String s = "PAL";
		 String p="";
		 List<String> l = new ArrayList<>();
		 for(int i=0;i<s.length();i++) {
			 for(int j=0;j<s.length();j++) {
				 if(i<j)
					 System.out.println(i+" "+j);
			 }
		 }
		 System.out.println(l);
	        return 0;
	  }
}
