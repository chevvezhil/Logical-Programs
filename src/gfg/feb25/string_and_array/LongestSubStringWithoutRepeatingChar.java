package gfg.feb25.string_and_array;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		String s = "abcdcefqwrty";
		
		 
		int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	      
	        while (i < n && j < n) {
	        	
	        	if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j));

	                j++;
	                ans = Math.max(ans, j - i);
	            }
	            else {
	            	
	                set.remove(s.charAt(i));
	                i++;
	            }
	        }
	       
	      

	        System.out.println(ans);
	}
	
}
