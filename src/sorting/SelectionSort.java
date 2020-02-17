package sorting;

public class SelectionSort {

	public static void main(String args[]){
	
	int[] nums = new int[] {10,7,3,8,2,89};
	
	for(int i=0;i<nums.length-1;i++){
		
		for(int j=i+1; j<nums.length;j++){
			
			if(nums[j] < nums[i]){
				
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}
		
	}
	
	for (int i=0;i < nums.length ;i++){
		
		System.out.println(nums[i]);
		
	}
	
}
	
}
