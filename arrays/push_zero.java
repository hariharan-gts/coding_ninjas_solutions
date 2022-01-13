package arrays;


public class push_zero {
   public static void push(int a[]) {
	   int count=0;
	   for(int i=0;i<a.length;i++) {
		   if(a[i]!=0) {
			  a[count++]=a[i];
		   }
	   }
	  while(count<a.length) {
		  a[count++]=0;
	  }
	  for(int i:a) {
		  System.out.print(i+" ");
	  }
   }
	public static void main(String[] args) {
		int a[]= {0,3,0,2,0};
         push(a);
	}

}
