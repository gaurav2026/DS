import java.util.Arrays;

public class Prime {
	public static void main(String[] args) {
		int n = 20;
		printPrime(n);
	}

	private static void printPrime(int n) {
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);
		
		for(int i=2;i*i<=n;i++){
			if(prime[i]){
				for(int p=i*2;p<=n;p=p+i){
					prime[p] = false;
				}
			}
		}
		
		for(int i=2;i<n;i++){
			if(prime[i])
				System.out.print(i+" ");
		}
		
	}
}
