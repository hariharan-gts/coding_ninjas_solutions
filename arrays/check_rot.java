package arrays;

public class check_rot {
    public static void no_rot(int a[]) {
    	int max=a[0];
    	int i=0;
    	for(int j=1;j<a.length;j++) {
    		if(max<a[j]) {
    			max=a[j];
    		}else {
    			i=j;
    			break;
    		}
    	}
    	System.out.println(i);
    }
	public static void main(String[] args) {
		int a[]= {10,20,30,1};
		no_rot(a);

	}

}
