package String;

import java.util.Arrays;

/*
 * Check Permutation
Send Feedback
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"



Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
 */
public class permutation_String {

	public static void main(String[] args) {
		String a="abcde";
		String b="baedc";
		char c1[]=a.toCharArray();
		char c2[]=b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.compare(c1, c2));
	}

}
