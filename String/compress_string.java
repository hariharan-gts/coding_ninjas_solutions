package String;
import java.util.*;
import java.util.Map.Entry;
/*
 * Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
Explanation for Sample Output 1:
In the given string 'a' is repeated 3 times, 'b' is repeated 2
 times, 'c' is repeated 2 times and 'd', 's' and 'a' and occuring
  1 time hence no compression for last 3 characters.
Sample Input 2:
aaabbcddeeeee
Sample Output 2:
a3b2cd2e5
Explanation for Sample Output 2:
In the given string 'a' is repeated 3 times, 'b' is repeated 2
 times, 'c' is occuring single time, 'd' is repeating 2 times 
 and 'e' is repeating 25times.
 */


public class compress_string {
	
   public static void compress(String a) {
	   int count=1;
	   String ans="";
	   int s=0;
	   int e=0;
	   while(s<a.length()) {
		   while((e<a.length())&&(a.charAt(e)==a.charAt(s))) {
			   e+=1;
		   }
		   int tc=e-s;
		   if(tc!=1) {
			   ans+=a.charAt(s)+""+tc;
		   }else {
			   ans+=a.charAt(s);
		   }
		   s=e;
	   }
	 
	 System.out.println(ans);
	   
   }
	public static void main(String[] args) {
		String s="aaabbccdsa";
		compress(s);
	}

}
