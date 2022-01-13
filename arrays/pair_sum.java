package arrays;

public class pair_sum {

	public static void main(String[] args) {
		int a[]= {2,8,10,5,-2,5};
		int t=10;
		int count=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==t) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
