package runtime;

import java.util.HashMap;

public class TwoSum {

	
	public static void main(String[] args){
		
		
		 	int[] nums  = new int[] {2,7,11,15};
		 	int target = 9;
		 int[] values = new int[2];
	        
	        HashMap<Integer,Integer> map = new HashMap<>();
	        
	        for(int i=0;i<nums.length;i++){
	            
	            int diff = target - nums[i];
	            
	            if(map.containsKey(diff)){
	                values[0] = i;
	                values[1] = map.get(diff);
	                  
	                return;
	            }else {
	                
	            	System.out.println("nums[i] "  + nums[i] + "i " + i);
	                map.put(nums[i],i);
	            }
	        }
	        
	        
	        for(int i=0;i<2;i++){
	    		System.out.println(values[i]);
	    	}
	    }
		
	
}
