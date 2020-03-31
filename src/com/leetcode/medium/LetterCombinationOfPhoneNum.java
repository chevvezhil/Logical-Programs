package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationOfPhoneNum {

	static HashMap<String,String> map = new HashMap<>();
	static List<String> lst = new ArrayList<>();
	
	public static void main(String[] args) {
		
		String digits = "234";
			
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4","ghi");
		map.put("5","jkl");
		map.put("6","mno");
		map.put("7","pqrs");
		map.put("8","tuv");
		map.put("9","wxyz");
		
		backTracking("",digits);
		
		System.out.println("substring " + digits.substring(1));
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
	
	
	
	public static void backTracking(String combination,String digits) {
		
		
		if(digits.length()==0) {
			lst.add(combination);	
			return;
			}
		
		String nextDigit = digits.substring(0,1);
		
		String letters  = map.get(nextDigit);
		
		for(int i=0;i<letters.length();i++) {
			
			String let = Character.toString(letters.charAt(i));
			backTracking(combination+let,digits.substring(1));
		}
	}
	
	
}
