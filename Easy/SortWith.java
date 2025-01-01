package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWith {
	public static void main(String[] args) {
		   String[] strings = new String[]{"string1", "string2", "string3"};
		    final int[] ints = new int[]{40, 32, 34};

		    final List<String> stringListCopy = Arrays.asList(strings);
		    ArrayList<String> sortedList = new ArrayList(stringListCopy);
		    Collections.sort(sortedList, (left, right) -> ints[stringListCopy.indexOf(left)] - ints[stringListCopy.indexOf(right)]);
		    
		    System.out.println(sortedList);
		    
		    LeetCode();
	}
	
	//s = "codeleet", indices = [4,5,6,7,0,2,1,3]
	
	private static void LeetCode() {
		// TODO Auto-generated method stub
		
		String s[] = {"c","o","d","e","l","e","e","t"};
		int in[] = {4,5,6,7,0,2,1,3};
		
		List<String> al = Arrays.asList(s);
		ArrayList<String> alSort = new ArrayList<>(al);
		
		Collections.sort(alSort,(left,right) -> in[al.indexOf(left)] - in[al.indexOf(right)]);
		
		System.out.println(al);
	}
}
