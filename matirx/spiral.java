package matirx;

public class spiral {
    public static void spiral_print(int a[][]) {
    	int r=a.length;
    	int c=a[0].length;
    	int top=0,left=0,down=r-1,right=c-1;
    	int d=0;
    	while(top<=down && left<=right) {
    		if(d==0) {
    			for(int i=left;i<=right;i++) {
    				System.out.print(a[top][i]+" ");
    			}
    			top=top+1;
    		}
    		else if(d==1) {
    			for(int i=top;i<=down;i++) {
    				System.out.print(a[i][right]+" ");
    			}
    			right=right-1;
    		}else if(d==2) {
    			for(int i=right;i>=left;i--) {
    				System.out.print(a[down][i]+" ");
    			}
    			down-=1;
    		}else if(d==3) {
    			for(int i=down;i>=top;i--) {
    				System.out.print(a[i][left]+" ");
    			}
    			left=left+1;
    		}
    		d=(d+1)%r;
    	}
    }
	public static void main(String[] args) {
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		spiral_print(a);
	}

}
