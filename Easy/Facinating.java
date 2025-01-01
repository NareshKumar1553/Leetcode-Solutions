package Easy;

public class Facinating {
	    public static boolean isFascinating(int n) {
	       String a=n+"";
	       if(a.contains("0")) {
	    	   return false;
	       }
	       int num = n*2;
	       a+=num+"";
	       num=n*3;
	       a+=num+"";
	       
	       int count=0;
	       
	       for(int i=0;i<a.length();i++){
	           int l = Integer.parseInt(a.charAt(i)+"");
	           if(l<=9){
	               count++;
	           }
	           else{
	               return false;
	           }
	       }
	 //      System.out.print(count);
	       if(count==a.length()){
	           return true;
	       }
	       else{
	           return false;
	       } 
	    }
	   public static void main(String[] args) {
		   System.out.println(isFascinating(100));
	}
}
