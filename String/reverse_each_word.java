package String;
/*
 * Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
 */
public class reverse_each_word {
    public static void reverse(String s[]) {
    	for(int i=0;i<s.length;i++) {
    		String c=s[i];
    		for(int j=c.length()-1;j>=0;j--) {
    			System.out.print(c.charAt(j));
    		}
    		System.out.print(" ");
    	}
    }
	public static void main(String[] args) {
		String s="Welcome to Coding Ninjas";
		reverse(s.split(" "));

	}

}
