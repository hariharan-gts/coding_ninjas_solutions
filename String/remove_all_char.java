package String;

/*
 * Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
Sample Input 2:
xxyyzxx
y
Sample Output 2:
xxzxx
 */
public class remove_all_char {
   public static void remove(String s,char c) {
	  char t[]=s.toCharArray();
	  int j,count=0;
	  for(int i=j=0;i<t.length;i++) {
		  if(t[i]!=c) {
			  t[j++]=t[i];
		  }
		  else
			  count++;
	  }
	  
	  while(count>0) {
		  t[j++]='\0';
		  count--;
	  }
	  System.out.println(t);
   }
	public static void main(String[] args) {
		String s="aabccbaa";
		char c='b';
		remove(s,c);
	}

}
