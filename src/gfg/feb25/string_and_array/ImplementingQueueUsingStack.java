package gfg.feb25.string_and_array;

import java.util.Stack;

public class ImplementingQueueUsingStack {

	
		
		static Stack<Integer> stack1 = new Stack<>();
		static Stack<Integer> stack2 = new Stack<>();
	
		
		public static void main(String args[]) throws Exception  {
			ImplementingQueueUsingStack.enqueue(2);
			ImplementingQueueUsingStack.enqueue(3);
			
		System.out.println(ImplementingQueueUsingStack.dequeue());
			
			
		}

		
		static void enqueue(int x) {
			
			if(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			
			stack1.push(x);
			
			while(!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
		}
		
		static int dequeue() throws Exception {
			
			if(stack1.isEmpty())
				throw new Exception("Queue is empty");
			
			return stack1.pop();
			
			
		}
}
