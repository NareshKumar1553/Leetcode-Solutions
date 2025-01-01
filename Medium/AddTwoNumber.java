package medium;

import java.util.LinkedList;

public class AddTwoNumber {
	public static void main(String[] args) {
//		LinkedList<Integer> l = new LinkedList<Integer>();
//		l.add(5);
//		System.out.println(l);
		Input();
	}
	private static void Input() {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l2.add(1);
		l2.add(2);
		l2.add(3);
		Output(l1,l2);
	}
	private static void Output(LinkedList<Integer> l1,LinkedList<Integer> l2) {
		System.out.println(l1.peekFirst());
		String s1 = "";
		for(int i:l1) {
			s1 += i+"";
		}
		String s2 = "";
		for(int i:l2) {
			s2 += i+"";
		}
		int n = reverse(s1) + reverse(s2);
		System.out.println(reverse(n+""));
	}
	private static int reverse(String s) {
		StringBuffer s1 = new StringBuffer(s);
		s1.reverse();
		s = s1+"";
		return Integer.parseInt(s);
	}
}
