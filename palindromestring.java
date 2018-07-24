import java.util.Scanner;
public class palindromestring {
      public static void main(String[] args){
    	  Scanner sc=new Scanner(System.in);
    	  String a,b="";
    	  int i,j,l;
    	  a=sc.next();
    	  l=a.length();
    	  StringBuffer bu=new StringBuffer(a);
    	  bu.reverse();
    	  System.out.println(bu);
    	  if(a.equals(bu.toString())){
    	 /* for(i=l-1;i>=0;i--){
    		  b+=a.charAt(i);
    	  }
    		  if(a.equalsIgnoreCase(b)){*/
    			  System.out.println("palindrome");
    		  }
    		  else{
    			  System.out.println("not palindrome");
    		  }
    	  }    	  
      }

