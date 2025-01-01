package Easy;

public class SumArr {
	public static void main(String[] args) {
		int n[] = {1,2,3,4};
		int a[] = runningSum(n);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
	 public static int[] runningSum(int[] nums) {
	        int s[] = new int[nums.length];
	        //int k = 0;
	        for(int i=0;i<nums.length;i++){
	            int sum = 0;
	            for(int j=0;j<=i;j++){
	            	System.out.print(" s "+sum);
	                sum+=nums[j];
	            }
	            s[i] = sum;
	        }
	        return s;
	    }
}
