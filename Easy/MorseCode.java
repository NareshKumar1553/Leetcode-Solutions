package Easy;
import java.util.*;
public class MorseCode {
	public static void main(String[] args) {
		String a[] = {"gin","zen","gig","msg"};
		//String p = "ABCDEF";
		System.out.println(uniqueMorseRepresentations(a));
	}
	public static int uniqueMorseRepresentations(String[] words) {
        String symbol[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Set<String> set = new HashSet<>();
    for(int k=0;k<words.length;k++){
        String res = "";
        char c[] = words[k].toCharArray();
        for(int i=0;i<c.length;i++){
            int n = alpha.indexOf(c[i]);
            res += symbol[n];
        }
        set.add(res);
    }
    return set.size();
    }
}
