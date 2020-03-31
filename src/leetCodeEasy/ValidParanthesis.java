package leetCodeEasy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String args)
	{
		
		String string = "([)]";
		
		HashMap<Character,Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(')','(');
		map.put(']','[');
		
		Stack<Character> stack = new Stack<>();
		
		char[] charArray = string.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			
			if(!map.containsKey(charArray[i])) {
				stack.push(charArray[i]);
			}else {
				
				char element = stack.pop();
					if(map.get(charArray[i]) != element) {
						System.out.println("false");
					
				}
				
			}
				
			
		}
		
		System.out.println(stack.isEmpty());
	}
}
