package gfg.feb25.string_and_array;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PossiblePalindrome {

	
	public static void main(String[] args) {
		String s = "nitin";
		 System.out.println("All possible palindrome" +  
                 "partions for " + s  
                 + " are :"); 
		 ArrayList<ArrayList<String>> allPart = allPalPartition(s);
		
		 String temp = "";
		 
		 int length = 0;
		 
		 for(int i=0;i< allPart.size();i++) {
				for(int j=0;j<allPart.get(i).size();j++) {
					System.out.print(allPart.get(i).get(j) + " ");
					
					if(allPart.get(i).size() > length) {
						length = allPart.get(i).size();
						temp = allPart.get(i).toString();
					}
				}
				System.out.println();
			}
		 
		 System.out.println("legth " + length);
		 System.out.println("temp " + temp);
	}
	
	private static ArrayList<ArrayList<String>>  allPalPartition(String input) {
		
		ArrayList<ArrayList<String>> allPart = new ArrayList<>();
		Deque<String> queue = new LinkedList<>();
		
		allPalPartitionUtil(input,allPart,queue,0,input.length());
		
		return allPart;
	}
	
	
	private static void allPalPartitionUtil(String input,ArrayList<ArrayList<String>>allPart, Deque<String> currPart,int start,int length) {
		
		if(start >=length) {
			allPart.add(new ArrayList<>(currPart));
			return;
		}
		
		for(int i=start; i<length;i++) {
			if(isPalindrome(input,start,i)) {
				currPart.addLast(input.substring(start,i+1));
				allPalPartitionUtil(input,allPart,currPart,i+1,length);
				currPart.removeLast();
				
			}
		}
		
	}
	
	private static boolean isPalindrome(String input,int start,int end) {
	
		while (start < end)  
        { 
            if (input.charAt(start++) != input.charAt(end--)) 
                return false; 
        } 
        return true; 
	}
	
}
