package matirx;

/*
 * Input :  1  2  3  4
         5  6  7  8
         9  10 11 12
         13 14 15 16
Output : 4 8 12 16 15 11 7 3 2 6 10 14 13 9 5 1

Input :  1  9  4  10
         3  6  90 11
         2  30 85 72
         6  31 99 15 
Output : 10 11 72 15 99 85 90 4 9 6 30 31 6 2 3 1
 */
public class wave {
    public static void wave(int a[][]) {
    	int j=0;
    	for(int i=0;i<a.length;i++) {

    		if(i%2==0) {
    			for(int k=0;k<a.length;k++) {
    				System.out.print(a[k][j]+" ");
    			}
    			j+=1;
    		}
    		else {
    			for(int k=a.length-1;k>=0;k--) {
    				System.out.print(a[k][i]+" ");
    			}
    			j+=1;
    		}
    	}
    }
    public static void wave1(int a[][]) {
    	int r=a.length;
    	int c=a[0].length;
    	int j=c-1;
    	int wave=1;
    	while(j>=0) {
    		if(wave==1) {
    			for(int i=0;i<r;i++) {
    				System.out.print(a[i][j]+" ");
    			}
    			j--;
    			wave=0;
    		}else {
    			for(int i=r-1;i>=0;i--) {
    				System.out.print(a[i][j]+" ");
    			}
    			j--;
    			wave=1;
    		}
    	}
    }
	public static void main(String[] args) {
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		wave1(a);

	}

}
