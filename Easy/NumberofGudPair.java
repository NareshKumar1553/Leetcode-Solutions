package Easy;

import java.util.Arrays;

public class NumberofGudPair {
	public static void main(String[] args) {
		int[] nums = {6,5,1,5,7,7,9,1,5,7,1,6,10,9,7,4,1,8,7,1,1,8,6,4,7,4,10,5,3,9,10,1,9,5,5,4,1,7,4,2,9,2,6,6,4,2,10,3,5,3,6,4,7,4,6,4,4,6,3,4,10,1,10,6,10,4,9,6,6,4,8,6,9,5,4};
		Arrays.sort(nums);
		System.out.println(numIdenticalPairs(nums));
	}
	public static int numIdenticalPairs(int[] nums) {
		int max = 0;
		for(int i=0;i<nums.length;i++) {
			if(max<nums[i]) {
				max = nums[i];
			}
		}
		int n[] = new int[max+1];
		for(int i=0;i<nums.length;i++) {
			n[nums[i]]++;
		}
		int count=  0;
		for(int i=0;i<n.length;i++) {
			if(n[i]>1) {
				count += combination(n[i],2);
			}
		}
		
		return count;
    }
	private static int combination(int n, int r) {
		// TODO Auto-generated method stub
		return fact(n)/(fact(r)*fact(n-r));
		
	}
	static int fact(int n) {
		int r = 1;
		if(n==0) {
			return 1;
		}
			for(int i=2;i<=n;i++) {
				r *= i;
			}
		return r;
	}
}
