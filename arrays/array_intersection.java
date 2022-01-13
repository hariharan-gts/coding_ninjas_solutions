package arrays;

public class array_intersection {

	public static void main(String[] args) {
		int a1[]= {2,6,8,5,4,3,4};
		int a2[]= {2,3,4,7};
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					System.out.print(a1[i]+" ");
					a2[j]=Integer.MAX_VALUE;
					break;
				}
			}
		}

	}

}
