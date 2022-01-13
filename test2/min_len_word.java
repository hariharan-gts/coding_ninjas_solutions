package test2;

/*
 * Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
 */
public class min_len_word {

	public static void main(String[] args) {
		String s="abc de ghihjk a uvw h j";
		String a[]=s.split(" ");
		String min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min.length()>a[i].length())
				min=a[i];
		}
		System.out.println(min);
          
	}

}
