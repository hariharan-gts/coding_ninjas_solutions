package arrays;

import java.util.Arrays;

public class selectionSort {
   public static void sort(int a[]) {
	   int min=0;
	   for(int i=0;i<a.length-1;i++) {
		   min=i;
		   for(int j=i+1;j<a.length;j++) {
			   if(a[min]>a[j]) {
				   min=j;
			   }
		   }
		   swap(a,i,min);
	   }
   }
   public static void swap(int a[],int f,int s) {
	   int temp=a[f];
	   a[f]=a[s];
	   a[s]=temp;
   }
	public static void main(String[] args) {
		int a[]= {-2,1,-1,0,25,32,-23,99,111,-45};
		sort(a);
		System.out.println(Arrays.toString(a));

	}

}
