package medium;
import java.util.*;
public class TopFrequent {
	public static void main(String[] args) {
		int a[] = {1,1,1,2,2,3};
		System.out.println(Arrays.toString(topKFrequent(a, 2)));
		Map<Integer,Integer> m = new HashMap<>();
		m.put(-1, 1);
	}
	public static int[] topKFrequent(int[] nums, int k) {
        int max=0;
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> s = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
        	if(m.containsKey(nums[i])) {
        		m.put(nums[i], m.get(nums[i])+1);
        	}
        	else {
        		m.put(nums[i], 1);
        		s.add(nums[i]);
        	}
        }
        //System.out.println(s.get(2));
        
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<m.size();i++){
            if(m.get(s.get(i)) >=2) {
            	l.add(s.get(i));
            }
        }
        //System.out.println(l);
        nums = new int[l.size()];
        for(int i=0;i<l.size();i++){
            nums[i] = l.get(i);
        }
        return nums;
    }
}
