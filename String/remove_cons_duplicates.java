package String;

import java.util.Arrays;

/*
 * Remove Consecutive Duplicates

Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
 */
public class remove_cons_duplicates {
    public static char[] remove(char c[]) {
    	int j=0;
    	for(int i=1;i<c.length;i++) {
    		if(c[i]!=c[j])
    		{
    			
    			j++;
    			c[j]=c[i];
    		    
    		}
    	}
    	return Arrays.copyOfRange(c, 0, j+1);
    }
	public static void main(String[] args) {
		String a="aabbcc";
		System.out.println((remove(a.toCharArray())));
	}

}
