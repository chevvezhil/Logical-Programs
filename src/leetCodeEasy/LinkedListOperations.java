package leetCodeEasy;

 class ListNode{
	
	int val;
	ListNode next;
	ListNode (int x){
		val = x;
	}
}

public class LinkedListOperations {
	
	ListNode  head;
	
	public void createLinkedList(int x) {
		if(head == null) {
			head = new ListNode(x);
			return;
		}else {
			
			ListNode newNode = new ListNode(x);
			
			ListNode temp = head;
			while(temp.next !=null) {
				temp = temp.next;
				
			}
			temp.next = newNode;
			//head.next = newNode;
		}
			
		
	 }
	 
	
	public  void printNode() {
		
		ListNode temp = head;
		while(temp !=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
	
	
	public void removeDuplicate() {
		ListNode temp = head;
		
		while(temp !=null && temp.next !=null) {
			
			if(temp.val == temp.next.val) 
				temp.next =temp.next.next;
			else
				temp = temp.next;
		}
		
		
	}
	
	public static void main(String args[]) {
		
		LinkedListOperations list = new LinkedListOperations();
		list.createLinkedList(2);
		list.createLinkedList(2);
		list.createLinkedList(5);
		list.createLinkedList(6);
		System.out.println("before removing duplicate");
		list.printNode();
		list.removeDuplicate();
		list.printNode();
	
	}
	
}
