package runtime;

import java.util.ArrayList;
import java.util.List;

public class AvailableCaptures {

	public static void main(String args[]){
	
		int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
		
	 List<List<Integer>> list = new ArrayList<>();
	 List<Integer> li = new ArrayList<>();
     
     for(int i=0;i<nums.length-2;i++){
         for(int j=i+1;j<nums.length-1;j++){
             if(nums[i] == nums[j]) continue;
             for(int k=j+1;k<nums.length;k++){
                 if(nums[i] == nums[k] || nums[j] == nums[k]) continue;
                 
                 if(nums[i]+nums[j]+nums[k] == 0){
                	
                	 li.add(nums[i]);
                 li.add(nums[j]);
                 li.add(nums[k]);
                 list.add(li);
                 }
                 
                 
             }
         }
     }
	}
     
}
