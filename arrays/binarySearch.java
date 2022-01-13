package arrays;

import java.util.Arrays;

public class binarySearch {
   public static int search(int a[],int x) {
	   int index=-1;
	   int s=0;
	   int e=a.length-1;
	   while(s<=e) {
		   int m=s+(e-s)/2;
		   if(a[m]==x)
			   return m;
		   else if(x<a[m])
			   e=m-1;
		   else
			   s=m+1;
	   }
	   
	   return index;
   }
	public static void main(String[] args) {
		int a[]= {-1,0,2,5,8,17,99,100,123,155,197};
       System.out.println(search(a,123));
       System.out.println(Arrays.binarySearch(a, 123));
	}

}
