package gfg.feb25.string_and_array;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
public class LongestPalindromicSubString {

	public static void main(String[] args) {
		
		String s = "babad";

		System.out.println("yes m compilng" + s.length());
		List<List<String>> part = new ArrayList<>();
		Deque<String> queue = new LinkedList<>();
		part = findAllPalindrome(part,queue,0,s.length(),s);
		for(int i=0;i<part.size();i++) {
			for(int j=0;i<part.get(i).size();j++) {
				System.out.println(part.get(i).get(j));
			}
		}
		
		
	}
	
	private static List<List<String>> findAllPalindrome(List<List<String>> allPart, Deque<String> queue,int start,int length,String input) {
		
		if(start >= length) {
			allPart.add(new ArrayList<>(queue));
		//	return allPart;
		}
		
		for(int i=start; i < length;i++) {
			
			if(isPalindrome(input,start,i)) {
				System.out.println("yes i am palindrome "  + input.substring(start,i+1) + "my length " + input.substring(start,i+1).length());
				
				queue.addLast(input.substring(start, i+1));
				findAllPalindrome(allPart,queue,i+1,length,input);
				queue.removeLast();
				
			}
		}
		
		return allPart;
		
	}
	
	
	private static boolean isPalindrome(String input,int start,int end) {
		
		System.out.println("inside palindrome fun " + input.substring(start,end));
		 while (start < end)  
	        { 
	            if (input.charAt(start++) != input.charAt(end--)) 
	                return false; 
	        } 
		
		return true;
	}
}
