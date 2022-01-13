package arrays;

public class left_rotate {
    public static void rotate(int a[],int d) {
    	if(d>=a.length) {
    		d=d%a.length;
    	}
    	for(int i=0;i<d;i++) {
    		int temp=a[0];
    		for(int j=0;j<a.length-1;j++) {
    			a[j]=a[j+1];
    		}
    		a[a.length-1]=temp;
    	}
    	for(int i:a) {
    		System.out.print(i+" ");
    	}
    }
    public static void rrotate(int a[],int d) {
    	System.out.println();
    	if(d>=a.length)
    		d=d%a.length;
    	for(int i=0;i<d;i++) {
    		int l=a[a.length-1];
    		for(int j=a.length-1;j>0;j--) {
    			a[j]=a[j-1];
    		}
    		a[0]=l;
    	}
    	for(int i:a) {
    		System.out.print(i+" ");
    	}
    }
    
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {1,2,3,4,5};
		int d=8;
		rotate(a,d);
		rrotate(b,3);
		

	}

}
