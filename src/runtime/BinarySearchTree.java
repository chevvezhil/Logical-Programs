package runtime;

public class BinarySearchTree {

	class Node {
		
		int key;
		Node left, right ;
		
		public  Node(int data){
			key= data;
			left = right = null;
		}
	}
	
		Node root;
	public BinarySearchTree() {
	 root = null;
	}
	
	
	public void insert(int element){
		root = insertRec(root,element);
	
	}
	
	Node insertRec(Node root, int ele){
		
		if(root == null){
			root = new Node(ele);
			return root;
		}
		
		if(root.key < ele)
			root.left = insertRec(root.right,ele);
		else 
			root.right = insertRec(root.left,ele);
		
		
		return root;
	}
	
	public static void main(String [] args){
		
		BinarySearchTree bst = new BinarySearchTree();
	}
	
}
