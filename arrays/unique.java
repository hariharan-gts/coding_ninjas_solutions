package arrays;
import java.util.*;
import java.util.Map.Entry;
public class unique {
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
    		if(mp.get(a[i])==1) {
    			System.out.print(a[i]+" ");
    			mp.put(a[i], -1);
    		}
    	}
    }
	public static void main(String[] args) {
		int a[]= {1,3,1,3,6,6,7,10,7,6,8,-1};
        un(a);
	}

}
