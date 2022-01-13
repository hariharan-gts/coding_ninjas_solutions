package arrays;

public class miss_and_repeat {
	public static void randmiss(int a[]){
        int temp[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(temp[a[i]-1]!=0){
                temp[a[i]-1]++;
            }else{
                temp[a[i]-1]=1;
            }
        }
        int rep=0;
        int mis=0;
        for(int i=0;i<a.length;i++){
            if(temp[i]>1){
                rep=i+1;
            }
            if(temp[i]==0){
                mis=i+1;
            }
        }
        System.out.println(rep+" "+mis);
    }
	public static void main(String[] args) {
		int a[]={1,2,3,5,5};
		randmiss(a);
		}
}
