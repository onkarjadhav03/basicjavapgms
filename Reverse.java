package basics;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		int i = 0;
		int rev = 0;
		int n;
		while(a!=0) {
			n=a%10;
			rev=rev*10+n;
			a=a/10;
		}
		System.out.println(rev);
	}
}
