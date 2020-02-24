package algorithm;

import java.util.ArrayList;

public class SeiveOfEratosthenLinearTimeComplexity {

	public static void main(String[] args) {
	
		
	int n= 5;
	int[] lp = new int[n+1];
	ArrayList<Integer> pr = new ArrayList<>();
	
	
	for(int i=2;i<=n;++i) {
		if(lp[i]==0) {
			lp[i] = i;
			pr.add(i);
		}
		
		for(int j=0;j<pr.size() && pr.get(j) <=lp[i] && i*pr.get(j)<=n;++j)
			lp[i * pr.get(j)] = pr.get(j);
		
	}
	
	for(int i=0;i<pr.size();i++) {
		System.out.println(pr.get(i));
	}
	
	}
}
