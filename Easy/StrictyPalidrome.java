package Easy;

public class StrictyPalidrome {
	public static void main(String[] args) {
		System.out.println(isStrictlyPalindromic(9));
	}
	 public static boolean isStrictlyPalindromic(int n) {
		 	String a = n+"";
		 	//System.out.println(a);
	       // int n2 = Integer.parseInt(a,2);
	       // int n3 = Integer.parseInt(a,3);
	        String b = Integer.toBinaryString(n);
	        String c = Integer.toOctalString(n);
	        System.out.println(c);
	        if(pali(b) && pali(c)){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	    public static boolean pali(String s){
	        StringBuffer sb = new StringBuffer(s);
	        sb.reverse();
	        if(sb.toString().equals(s)){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
}
