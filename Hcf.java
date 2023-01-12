
package basics;
import java.util.*;
public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			int a,b,c = 0;
			int i=2;

			a=sc.nextInt();
			b=sc.nextInt();
			
			while(a%b!=0) {
				 c=a%b;
				 a=b;
				 b=c;
				 
			}
			System.out.println(c);
			int d=(a*b)/c;
			System.out.println(d);
			
	}

}
