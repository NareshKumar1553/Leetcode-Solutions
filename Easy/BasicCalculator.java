package Easy;

import java.util.Arrays;

public class BasicCalculator {
	public static void main(String[] args) {
		System.out.println(Result("3*3"));
	}
	private static int Result(String s) {
		String operator[] = s.split("[0-9]");
		String operand[] = s.split("[^0-9]");
		int res = 0;
		//System.out.println(Arrays.toString(operator));
		int operatorCount = operator.length;
		if(operator.length==1||operator.length==2) {
			String a = operator[operator.length-1];
			int x = Integer.parseInt(operand[0]);
			int y = Integer.parseInt(operand[1]);
			switch(a) {
			case "+":
				res = x+y;
				break;
			case "-":
				res = Math.abs(x-y);
				break;
			case "*":
				res = x*y;
				break;
			case "/":
				res = x/y;
				break;
			}
		}
		while(operatorCount-->=0) {
			String c=operator[0];
			switch(c) {
			case "*":
				res = Integer.parseInt(operator[0]);
			}
		}
		return res;
	}
}
