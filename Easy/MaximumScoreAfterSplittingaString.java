package Easy;

import java.util.Scanner;

class Solution {
    public int maxScore(String s) {
        int max = 0;
        for(int i=1;i<s.length();i++){
            String right = s.substring(i,s.length());
            String left = s.substring(0,i);
            int leftCount = left.replace("1","").length();
            int rightCount = right.replace("0","").length();
            int temp = leftCount+rightCount;
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
}

public class MaximumScoreAfterSplittingaString {

	public static void main(String[] args) {
		Solution soln = new Solution();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(soln.maxScore(s));
	}

}
