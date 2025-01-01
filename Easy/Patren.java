package Easy;

public class Patren {
	public static void main(String[] args) {
		System.out.println(patternCount("aa",".*"));
//		String s = "aa";
//		String p = "a*";
//		if(s.equals(p)) {
//			System.out.println("1"); 
//		}
//		else {
//		
//		int dot=0,ch=0,star=0,flag=0;
//		if(p.contains(".")) {
//			flag = 1;
//			System.out.println("1"); 
//		}
//		else{
//			if(p.contains("*")) {
//				System.out.println("***");
//				String str[]= p.split("[^A-z]");
//				System.out.println(str[0]);
//				if(s.contains(str[0])) {
//					flag = 1;
//				}
//			}
//		}
//		if(flag == 1) {
//			System.out.println("1"); }
//		else {
//			System.out.println("0"); 
//		}
//		}
	}
	private static boolean  patternCount(String s,String p) {
		// TODO Auto-generated method stub
		if(s.equals(p)) {
			return true;
		}
		else {
		
		int dot=0,ch=0,star=0,flag=0;
		if(p.contains(".")) {
			flag = 1;
			return true;
		}
		else{
			if(p.contains("*")) {
				//System.out.println("***");
				String str[]= p.split("[^A-z]");
				//System.out.println(str[0]);
				if(s.contains(str[0])) {
					flag = 1;
				}
			}
		}
		if(flag == 1) {
		return true;}
		else {
			return false;
		}
		}
	}
}
