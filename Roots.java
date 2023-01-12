package basics;
import java.util.*;
public class Roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

		 double det = b * b - 4 * a * c;
		int  firstroot = (int)(-b + Math.sqrt(det)) / (2 * a);
		int  secondroot = (int)(-b - Math.sqrt(det)) / (2 * a);

        if(firstroot>secondroot){
            System.out.println(secondroot);
		System.out.println(firstroot);
        }
        else{
		System.out.println(firstroot);
		System.out.println(secondroot);
        }
	}
}
