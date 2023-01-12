package basics;
import java.util.*;
public class Basetobase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        
		 int b1=sc.nextInt();
	        int b2=sc.nextInt();
	        int a=sc.nextInt();
         int dec=anytodecimal(a,b1);
         int num=decimaltoany(dec,b2);
        System.out.println(num);
 }

 public static int anytodecimal(int n,int b1){
     int sum=0;
	       int p=1;

	       while(n!=0){
	           int rem=n%10;
	            sum=sum+(rem*p);

	            n=n/10;
	            p=p*b1;

	       }
        return sum;
 }

 public static int decimaltoany(int n,int b2){
     int sum1=0;
	       int p1=1;

	       while(n!=0){
	           int rem=n%b2;
	            sum1=sum1+(rem*p1);

	            n=n/b2;
	            p1=p1*10;

	       }
        return sum1;
 }

}
