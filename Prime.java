package basics;

public class Prime {
	public static void main(String[] args) {
		int n=2;
		int N=100;
	
		while(n<=N) {
			int i=2;
			boolean cnt=true;
			
		while(i<=n/2) {
			if(n%i==0) {
				
				cnt=false;
				//System.out.println("not prime");
				break;
			}
			i+=1;
		}
		
		if(cnt) {
			System.out.println(n);
		}
		
		n+=1;
		}
	}
}
