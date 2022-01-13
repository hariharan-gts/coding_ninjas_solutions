package arrays;

import java.util.Arrays;

public class bubble_sort {
    public static void sort(int a[]) {
    	boolean flag;
    	for(int i=0;i<a.length-1;i++) {
    		flag=false;
    		for(int j=0;j<a.length-i-1;j++) {
    			if(a[j]>a[j+1]) {
    				flag=true;
    				swap(a,j,j+1);
    			}
    			
    		}
    		if(flag==false)
				break;
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
