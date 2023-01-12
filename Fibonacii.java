package basics;

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0;
		int n=10;
		int i=0;
		while(i<n) { 
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		
	}

}
