package String;
/*
 * Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
 */
public class max_occuring_char {
  public static void max_char(String s) {
	  int count[]=new int[256];
	  for(int i=0;i<s.length();i++) {
		  count[s.charAt(i)]++;
	  }
	  int max=-1; 
	  int max_i=-1;
	  for(int i=0;i<count.length;i++) {
		  if(max<count[i]) {
			  max=count[i];
			  max_i=i;
		  }
	  }
	  
	  System.out.println((char)max_i);
  }
	public static void main(String[] args) {
		String s="abcdefaaaffccvghjklaa";
		max_char(s);

	}

}
