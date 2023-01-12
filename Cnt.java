package basics;

import java.util.*;
public class Cnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int dig=sc.nextInt();
		
		
		
		int cnt=0;

		while(num > 0){
	         int rem = num%10;
	         if(rem==dig) {
	        	 cnt++;
	        	 //System.out.print(rem);
	         }
	         
	         num=num/10;
        
		}
	     System.out.println(cnt);
		}
		
	}


