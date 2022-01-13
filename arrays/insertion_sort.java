package arrays;

import java.util.Arrays;

public class insertion_sort {
     public static void sort(int a[]) {
    	 for(int i=1;i<a.length;i++) {
    		 int j=i-1;
    		 int key=a[i];
    		 while(j>=0&&key<a[j]) {
    			 a[j+1]=a[j];
    			 j--;
    		 }
    		 a[j+1]=key;
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
