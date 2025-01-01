package Easy;

import java.util.Scanner;
import java.util.Stack;

public class NKStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> sta = new Stack<>();
		String s = "({[})";
		char c[] = s.toCharArray();
		sta.push(c[0]);
		for(int i=1;i<c.length;i++) {
			if(c[i]==')' && sta.peek()=='(') {
				sta.pop();
			}
			else if(c[i]==']' && sta.peek()=='[') {
				sta.pop();
			}
			else if(c[i]=='}' && sta.peek()=='{') {
				sta.pop();
			}
			else {
				sta.push(c[i]);
			}
		}
		if(sta.isEmpty()) {
			System.out.println("Emp");
		}
		else {
			System.out.println("Not");
		}
	}

}
