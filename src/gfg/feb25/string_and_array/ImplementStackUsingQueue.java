package gfg.feb25.string_and_array;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
	static int  size = 0;
	
	static Queue<Integer> q1 = new LinkedList<>();
	static Queue<Integer> q2 = new LinkedList<>();

	public static void main(String args[]) {
		
		ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
		stack.push(1);
		stack.push(2);
		
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
		
	}
	
	static void push(int element) {
		size++;
		q2.add(element);
		
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}
	
	static void pop() {
		
		size--;
		if(q1.isEmpty()) {
			return;
		}
			q1.remove();
	}
	
	static int top() {
		if(q1.isEmpty())
			return -1;
			
	return q1.peek();
	}
}
