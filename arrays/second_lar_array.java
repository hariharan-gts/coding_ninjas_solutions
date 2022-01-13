package arrays;

import java.util.Arrays;

public class second_lar_array {
    static int s_max(int a[]) {
    	
    	Arrays.sort(a);
    	int max=a[a.length-1];
    	int i=a.length-1;
    	while(i>=0) {
    		if(a[i]<max) {
    			max=a[i];
    			return max;
    		}
    		i--;
    	}
    	if(max==a[a.length-1])
    		return Integer.MIN_VALUE;
    	
    	return max;
    }
	public static void main(String[] args) {
		int a[]= {6,6,6};
		System.out.println(s_max(a));

	}

}
