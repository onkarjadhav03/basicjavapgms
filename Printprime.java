package basics;

import java.util.*;
public class Printprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
    	int n1=2;
    	int n2=sc.nextInt();
    	
    	while(n1<=n2) {
    	
    	int i=2;
    	int cnt=0;
    	
    	while(i*i<=n1) {
    		if(n1%i==0) {
    			
    			cnt++;
    			break;
    		}
    		i++;
    	}
    	if(cnt==0) {
    		System.out.println(n1);
    	}
    	n1++;
	}
		
		
//		System.out.println("Enter a number range to generate prime numbers in between");
//        Scanner scanner = new Scanner(System.in);
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        
//        while (number1 <= number2) {
//            int i = 2, count = 0;
//            while (i <= number1 / 2) {
//                if (number1 % i == 0) {
//                    count++;
//                    break;
//                }
//                i++;
//            }
//            if (count == 0) {
//                System.out.println(number1 + " is prime number");
//            }
//            number1++;
//        }
}
}

