package medium;
import java.util.*;
public class SortByFrequency {
	public static void main(String[] args) {
		String s = "aaaccc"; //"eeeeaaarrd"
		System.out.println(frequencySort(s));
	}
	public static String frequencySort(String s) {
        String res="";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
        	if(map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	}
        	else {
        		map.put(s.charAt(i),1);
        	}
        }
        int n=map.size();
       while(n-->0) {
    	   int max=0;
    	   char find = ' ';
        for(Map.Entry<Character, Integer> i : map.entrySet()) {
        	char ch = i.getKey();
        	int fq = i.getValue();
        	if(max<fq) {
        		max = fq;
        		find = ch;
        	}
        }
        int value = map.get(find);
        for(int k=0;k<value;k++) {
        	res+=find;
        	map.put(find, 0);
        }
       }
       return res;
    }
	private static String Rev(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
}
