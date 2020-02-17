package runtime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeArray {

	public static void main(String[] args) {

		
		int arr1[] = new int[] {2,3,1,3,2,4,6,7,9,2,19};
		int arr2[] = new int[] {2,1,4,3,9,6};
		Map<Integer,Integer> occuranceMap = new HashMap<>();
        
        for(int i=0;i<arr1.length;i++){
            occuranceMap.put(arr1[i],occuranceMap.getOrDefault(arr1[i],0)+1);
        }
        
        int j=0;
        for(int i=0;i<arr2.length;i++){
            int count = occuranceMap.get(arr2[i]);
            for(int k=0;k<count;k++){
                arr1[j]=arr2[i];
                j++;
            }
            occuranceMap.remove(arr2[i]);
        }
        int x=j;
        for (int key : occuranceMap.keySet()) {
            for (int z=0; z<occuranceMap.get(key); z++) {
                arr1[x++] = key;
            }
        }
        
        Arrays.sort(arr1);
        System.out.println("j value " + j);
        for(int i=0;i<arr1.length;i++){
        	System.out.println(arr1[i]);
        }
	}

}
