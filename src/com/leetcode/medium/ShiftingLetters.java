package com.leetcode.medium;

public class ShiftingLetters {

	public static void main(String[] args) {
        
		StringBuilder ans = new StringBuilder();

		String S = "abc";
		int[] shifts = new int[] {3,5,9};
		
		  int X = 0;
	        for (int shift: shifts)
	            X = (X + shift)% 26;
	        
	        System.out.println("value of x " + X);
	        
	        for (int i = 0; i < S.length(); ++i) {
	            int index = S.charAt(i) - 'a';
	            System.out.println(S.charAt(i) + "after " + index + "char " + ((index + X) % 26 + 97));
	            
	            ans.append((char) ((index + X) % 26 + 97));
	            X = Math.floorMod(X - shifts[i], 26);
	            
	            System.out.println("value of x after " + X);
	        }

	        System.out.println( ans.toString());
		
	}
	
}
