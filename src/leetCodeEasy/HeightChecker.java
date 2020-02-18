package leetCodeEasy;

import java.util.Arrays;

public class HeightChecker {

	
	public static void main(String[] args){
		        
		        int count =0;
		        
		        int[] height = new int[]{1,1,4,2,1,3};
		        int[] copy = new int[height.length];
		        for(int i=0;i<height.length;i++){
		            copy[i] = height[i];
		        }
		        Arrays.sort(height);
		        
		        for (int i=0;i<height.length;i++){
		            if(copy[i] != height[i])
		                count++;
		        }
		        System.out.println(count);		    
		    }
		          
	
}
