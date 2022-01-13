package arrays;

import java.util.HashMap;
import java.util.Map;

public class find_duplicates {
	public static void un(int a[]) {
    	Map<Integer,Integer>mp=new HashMap<>();
    	for(int i=0;i<a.length;i++) {
    		if(mp.get(a[i])!=null) {
    			mp.put(a[i], mp.get(a[i])+1);
    		}else {
    			mp.put(a[i], 1);
    		}
    	}
    	for(int i=0;i<a.length;i++) {
    		if(mp.get(a[i])>1) {
    			System.out.print(a[i]+" ");
    			mp.put(a[i], -1);
    		}
    	}
    }
	public static void dup(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			a[a[i]%n]=a[a[i]%n]+n;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>=2*n)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {8,8,8};
		dup(a);

	}

}
