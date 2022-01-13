package patterns;

/*
 * Arrow pattern
Send Feedback
Print the following pattern for the given number of rows.
Assume N is always odd.
Note : There is space after every star.
Pattern for N = 7
*
 * *
   * * *
     * * * *
   * * *
 * *
*
 */
public class arrow {

	public static void main(String[] args) {
		int n=7;
		int n1=n/2+1;
		int n2=n/2;
		for(int i=0;i<n1;i++) {
			int spc=i;
			for(int j=0;j<spc;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n2;i++) {
			int spc=n2-i-1;
			for(int j=0;j<spc;j++) {
				System.out.print(" ");
			}
			for(int j=n2-i-1;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
