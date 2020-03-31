package gfg.feb25.string_and_array;

import java.util.Stack;

public class NextGreaterElement 
{ 
	
	
	static void printNGE(int arr[], int n) 
	{ 
		int i = 0;
		
		Stack<Integer> s = new Stack<>();
		
		int element, next; 
		s.push(arr[0]); 

		for (i = 1; i < n; i++) 
		{ 
			next = arr[i]; 

			if (s.isEmpty() == false) 
			{ 
				
				element = s.pop(); 
				System.out.println("element " + element);
			
				while (element < next) 
				{ 
					System.out.println(element + " --> " + next); 
					if (s.isEmpty() == true) 
						break; 
					element = s.pop(); 
				} 

				if (element > next) 
					s.push(element); 
			} 
			System.out.println("stack is empty when " + next);
			s.push(next); 
		} 

		
		while (s.isEmpty() == false) 
		{ 
			element = s.pop(); 
			next = -1; 
			System.out.println(element + " -- " + next); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int arr[] = {4,5,2,25 }; 
		int n = arr.length; 
		//printNGE(arr, n);
		
		int element,next;
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(arr[0]);
		
		for(int i=1;i<n;i++) {
			
			next = arr[i];
			
			element = stack.pop();
			
			if(element < next) {
				
				while(element < next) {
					
				System.out.println(element + "--->" + next);
				if(stack.isEmpty()) 
					break;
				element = stack.pop();
					
				}
				
			}else {
				stack.push(element);
			}
					
			stack.push(next);
			
		}
		
		while(!stack.isEmpty()) {
			element = stack.pop();
			System.out.println(element + "---->" + "-1");
		}
		
		
	} 
} 

