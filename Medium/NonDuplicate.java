package medium;
import java.util.*;
public class NonDuplicate {

	public static void main(String[] args) {
		int a[] = {1,1,2,3,3,4,4,8,8};
		System.out.println(singleNonDuplicate(a));
	}
	public static int singleNonDuplicate(int[] a) {
        List<Integer> l =new ArrayList<>();
        for(int i:a)
            l.add(i);
        for(int p:l){
            if((Collections.frequency(l,p))==1)
            	return p;
        }
        return -1;
    }

}
