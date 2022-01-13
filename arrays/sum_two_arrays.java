package arrays;

import java.util.Arrays;

public class sum_two_arrays {
   public static int[] sum(int a[],int b[]) {
	   int l1=a.length;
	   int l2=b.length;
	   int k=Math.max(l1, l2)+1;
	   int sum[]=new int[k];
	   int i=l1-1,j=l2-1;
	   int c=0;
	   int s=0;
	   while(i>=0 && j>=0) {
		   s=a[i]+b[j]+c;
		   sum[k-1]=s%10;
		   c=s/10;
		   k-=1;
		   j-=1;
		   i-=1; 
	   }
	   while(i>=0) {
		   s+=a[i]+c;
		   sum[k-1]=s%10;
		   c=c/10;
		   i-=1;
		   k-=1;
	   }
	   while(j>=0) {
		   s+=b[j]+c;
		   sum[k-1]=s%10;
		   c=c/10;
		   j-=1;
		   k-=1;
	   }
	   if(c!=0) {
		   sum[0]=c;
	   }
	   return sum;
   }
	public static void main(String[] args) {
		int a[]= {6,2,4};
		int b[]= {2,5,6};
		System.out.println(Arrays.toString(sum(a,b)));

	}

}
