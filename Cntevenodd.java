package basics;

import java.util.*;
public class Cntevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int evensum=0,oddsum=0;
		int cnt=1;
		int n=1234;
		
		while(n!=0) {
			
			int rem=n%10;
			if(cnt%2==0) {
				evensum=evensum+rem;
			}
			else {
				oddsum=oddsum+rem;
			}
		}
		
		System.out.println(oddsum);
        System.out.println(evensum);
        
	
	}
}
