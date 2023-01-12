package basics;
import java.util.*;
public class Printseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int sum=0;
		if(n!=0) {
			for (int i=0; i < 100; i++) {
				sum=3*n+2;
			    if (sum % x == 0) {
			        System.out.println(sum);
			    }
			}
			n--;
		}	
	}

}
