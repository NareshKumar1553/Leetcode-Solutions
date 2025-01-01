package Easy;

import java.util.Arrays;

public class StudentAttendance {
	public static void main(String[] args) {
		System.out.println(checkRecord("LALL"));
	}
	 public static boolean checkRecord(String s) {
		 int p=0,l=0,a=0;
		 for(int i=0;i<s.length();i++) {
			 char c = s.charAt(i);
			 switch(c) {
			 case 'A':
				 a++;
				 break;
			 case 'L':
				 l++;
				 break;
			 }
		 }
		 boolean flag = true;
		 for(int i=0;i<s.length()-2;i++) {
			if(s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2) == 'L')
				 flag = false;
		 }
	     if(flag) {
	    	 if(a<2)
	    		 return true;
	    	 else
	    		 return false;
	     }
	     else
	    	 return false;
	    }
}
