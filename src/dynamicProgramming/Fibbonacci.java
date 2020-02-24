package dynamicProgramming;

public class Fibbonacci {

	
	int[] lookUp = new int[100];

	
	public void initialize() {
	
		for(int i=0;i<100;i++)
			lookUp[i] = -1;
	}
	
	public int memoizationApproach(int n) {

		if(lookUp[n] == -1) {
			
			if(n<=1)
				 lookUp[n] = n;
			else
				lookUp[n] = memoizationApproach(n-1) + memoizationApproach(n-2);
		}
		
		return lookUp[n];
	}
	
	
	public int tablulationApproach(int n) {
		    int f[] = new int[n+1]; 
		    f[0] = 0; 
		    f[1] = 1; 
		    for (int i = 2; i <= n; i++) 
		          f[i] = f[i-1] + f[i-2]; 
		    return f[n]; 
		  
	}
	
	public static void main(String[] args) {
		Fibbonacci fib = new Fibbonacci();
		//fib.initialize();
		
		System.out.println(fib.tablulationApproach(20));
	}
	
}
