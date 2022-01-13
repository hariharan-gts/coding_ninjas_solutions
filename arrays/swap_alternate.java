package arrays;

import java.util.Arrays;

/*
 * Sample Input 1:
1
6
9 3 6 12 4 32
Sample Output 1 :
3 9 12 6 32 4
Sample Input 2:
2
9
9 3 6 12 4 32 5 11 19
4
1 2 3 4
Sample Output 2 :
3 9 12 6 32 4 11 5 19 
2 1 4 3 
 */
public class swap_alternate {

	public static void main(String[] args) {
		int a[]= {9 ,3 ,6 ,12 ,4 ,32 ,5 ,11 ,19 };
		for(int i=0;i<a.length-1;i+=2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
