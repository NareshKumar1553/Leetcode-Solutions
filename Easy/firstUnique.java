package Easy;
import java.util.*;
public class firstUnique {
	public static void main(String[] args) {
		String a="aadadaad";
		System.out.println(firstUniqChar(a));
	}
	 public static int firstUniqChar(String s) {
	        int res=-1;
	        String temp="";
	        List<Character> l = new ArrayList<>();
	        for(int i=0;i<s.length();i++) {
	        	if(l.contains(s.charAt(i)) || temp.contains(s.charAt(i)+"")) {
	        		l.remove(l.indexOf(s.charAt(i)));
	        		temp+=s.charAt(i);
	        	}
	        	else {
	        		l.add(s.charAt(i));
	        	}
	        }
	        System.out.println(temp);
	        System.out.println(temp.contains("a"));
	        if(l.size()==0) {
	        	return -1;
	        }
	        return s.indexOf(l.get(0));
	    }
}
