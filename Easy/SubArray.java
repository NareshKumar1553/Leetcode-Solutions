package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int n = 5;
		
		int a[] = new int[]{1,2,3,4,5};
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
		List<Integer> al = new ArrayList<>();
		for(Integer I : a) {
			al.add(I);
		}
		//Finding(al);
		System.out.println(findSubarrays(a));
//		for(int i=0;i<n;i++) {
//			for(int j=i;j<n;j++) {
//				for(int k=i;k<=j;k++) {
//					int sum=0;
//					System.out.print(a[k]+" ");
//					sum += a[k];
//					System.out.print("Sum = "+sum);
//				}
//				System.out.println();
//			}
//			//System.out.println();
//		}
		
	}

	private static void Finding(List<Integer> al) {
				for(int i=0;i<=al.size();i++) {
					List<Integer> a = new ArrayList<>();
					for(int j=i;j<=al.size();j++) {
						a = al.subList(i, j);
						if(a.size()==2) {
							System.out.print(a);
						}
					}
					System.out.println();
				}
	}
	public static boolean findSubarrays(int[] nums) {
		List<Integer> al = new ArrayList<>();
		List<List<Integer>> b = new ArrayList<>();
		boolean flag=false;
		for(int i:nums) {
			al.add(i);
		}
		for(int i=0;i<=al.size();i++) {
			List<Integer> a = new ArrayList<>();
			for(int j=i;j<=al.size();j++) {
				a = al.subList(i, j);
				if(a.size()==2) {
					b.add(a);
				}
			}
		}
		
		System.out.println(b);
//		al.removeAll(al);
		
		for(int i=0;i<b.size();i++) {
			int sum = 0;
//			List<Integer> a = b.get(i);
//			a=b.get(i);
//			System.out.println(b);
			for(int j:b.get(i)) {
				sum+=j;
			}
			System.out.println(b.get(i));
			if(al.contains(sum)) {
				flag=true;
				break;
			}
			else {
				al.add(sum);
			}
		}
		return flag;
//		boolean flag=false;
//		
//		List<Integer> a = new ArrayList<>();
//		int n = nums.length;
//		for(int i=0;i<n;i++) {
//			for(int j=i;j<n;j++) {
//				int sum=0;
//				if(Math.abs(i-j)==2) {
//				for(int k=i;k<=j;k++) {
//					sum += nums[k];
//				}
//				}
//				if(sum!=0)
//					a.add(sum);
//				if(al.contains(sum)) {
//					flag=true;
//					break;
//				}
//				else {
//					al.add(sum);
//				}
//			}
//			if(flag)
//				break;
//		}
//		System.out.println(a);
		//return true;
    }
}
