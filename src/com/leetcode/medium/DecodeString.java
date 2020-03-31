package com.leetcode.medium;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		
		System.out.println(decodeString("3[a]2[bc]"));
	}
	
    
    public static String decodeString(String s) {
    	
    	
    	if (s == null || s.length() == 0) return s;       

    	Stack<String> stack = new Stack<>();

    	
    	String num = "";

    	for (char c : s.toCharArray()) {
    		if (Character.isDigit(c)) {
    			num += c;
    		} else {
    			if (!num.equals("")) {
    				stack.push(num);
    				num = "";
    			}
    			if (c == '[')
    				stack.push("" + c);
    			else if (c == ']') {
    				StringBuilder sb = new StringBuilder();
    				
    				while (!stack.isEmpty() && !stack.peek().equals("[")) {
    					String str = stack.pop();
    					sb.insert(0, str);
    				}
    				if (!stack.isEmpty()) {
    					stack.pop();
    					int count = Integer.valueOf(stack.pop());
    					for (int i = 0; i < count; i++) 
    						stack.push(sb.toString());
    				}
    			} else if (Character.isLetter(c))
    				stack.push("" + c);
    		}   
    	}   
    	StringBuilder result = new StringBuilder();
    	while (!stack.isEmpty()) {
    		result.insert(0, stack.pop());
    	}
    	 return result.toString();
    }
   
    
}
