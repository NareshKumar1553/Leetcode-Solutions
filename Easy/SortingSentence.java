package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingSentence {
	public static void main(String[] args) {
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
	}
	public static String sortSentence(String s) {
		String h[] = s.split(" ");
		for(int i=0;i<h.length;i++) {
			String num[] = h[i].split("[A-z]");
			for(int j=0;j<num.length;j++){
	            //n[i] = Integer.parseInt(num[i]);
	        	System.out.print(num[j]+" ");
	        }
		}
        String num[] = s.split("[A-z\0]");
        String str[] = s.split("[^A-z]");
        int n[] = new int[num.length];
        for(int i=0;i<n.length;i++){
            //n[i] = Integer.parseInt(num[i]);
        	System.out.print(num[i]+" ");
        }
        
        String res = "";
        List<String> lcopy = Arrays.asList(str);
        ArrayList<String> lsort = new ArrayList<>(lcopy);
        Collections.sort(lsort,(left,right) -> n[lsort.indexOf(left)] - n[lsort.indexOf(right)]);
        for(int i=0;i<lsort.size();i++){
            res += lsort.get(i);
        }
        return num.length+"";
    }
}
