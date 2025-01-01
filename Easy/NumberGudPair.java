/*
Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0

for(int j=1;j<nums.length-1;j++) {
				if(nums[i] == nums[j]) {
					System.out.println(nums[i]+" "+nums[j]);
					c++;
					nums[i] = -1;
				}
			}
*/

package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class NumberGudPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = { 1,1,1,1};
		System.out.println(numIdenticalPairs(n));
	}

	public static int numIdenticalPairs(int[] nums) {
		Arrays.sort(nums);
		int c = 0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] == nums[i+1]) {
				c++;
			}
		}
		return c+1;

	}
}
