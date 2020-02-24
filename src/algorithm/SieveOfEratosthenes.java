package algorithm;

public class SieveOfEratosthenes {

	/* Time complexity : O(n*log(log(n))) */
	
	public void printPrime(int n) {
		
		boolean[] visited = new boolean[n+1];
		for(int i=0;i<=n;i++)
			visited[i] = true;
		
		for(int p=2 ; p*p<=n ; p++) {
			
			if(visited[p] == true) {
				
				for(int i=p*p ;i<=n; i+=p) {
					visited[i] =false;
				}
			}
			
		}
		
		int count =0;
		
		for(int i=0;i<=n;i++) {
			if(visited[i] == true) {
				System.out.println(i);
				count++;
			}
		}
		
		System.out.println("count "  + count);
	}
	
	
	public static void main(String[] args) {
		SieveOfEratosthenes se = new SieveOfEratosthenes();
		se.printPrime(5);
		
	}
	
	
}
