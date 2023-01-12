package basics;

public class PrimeFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,n=24;
		
		while(n!=1) {
			if(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			else {
				i++;
			}
		}

	}

}
