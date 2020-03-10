package gfg.feb25.string_and_array;

import java.util.ArrayList;
import java.util.List;

public class CountTriplets {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {5,2,0,1};
		int n = arr.length;
		int sum = 10;
		List<List<Integer>> list = new ArrayList<>();
		
		List<Integer> li = new ArrayList<>();
		
		int ans = 0;
		
		for(int i=0; i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i] + arr[j] + arr[k] < sum) {
						li.add(arr[i]);
						li.add(arr[j]);
						li.add(arr[k]);
						list.add(li);
						ans++;
					}
				}
			}
		}
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.get(i).size();j++) {
				System.out.println(list.get(i).get(j));
			}
		}
	}

}
