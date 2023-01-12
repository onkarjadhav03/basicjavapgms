package basics;

public class Fibpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int nst = 1;
		int row=1;
		int a=0,b=1,c=0;
		int i=0;
		
		while(row<=n) {
			
			
			//int n=10;
			
			
			int cst=1;
			
			while(cst<=nst) {
				System.out.print(a+" ");
				c=a+b;
				a=b;
				b=c;
				cst++;
				
				
			}
            row++;
			nst++;
			System.out.println();
		}
		}
	}	
	

