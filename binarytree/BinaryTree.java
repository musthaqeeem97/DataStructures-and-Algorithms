package binarytree;

import java.util.Stack;


public class BinaryTree {

	private Node root;
	
	class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	public void createBinaryTree() {
		
		Node firstNode = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);
		Node fourthNode = new Node(4);
		Node fifthNode = new Node(5);
		Node sixthNode = new Node(6);
		Node seventhNode = new Node(7);
				
		root = firstNode;
		root.left = secondNode;
		root.right = thirdNode;
		secondNode.left = fourthNode;
		secondNode.right = fifthNode;
		thirdNode.left = sixthNode;
		thirdNode.right = seventhNode;
	}
	public void recursivePreOrder(Node root) {
		if (root == null)return;
		
		System.out.print(root.data + " ");
		recursivePreOrder(root.left);
		recursivePreOrder(root.right);
	}
	public void iterativePreOrder(Node root) {
		
		if(root==null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node tempNode = stack.pop();
			System.out.print(tempNode.data+" ");
			if(tempNode.right!=null) {
				stack.push(tempNode.right);
			}
			if (tempNode.left!=null) {
				stack.push(tempNode.left);
			}
			
		}
		
	}
	public void recursiveInOrder(Node root) {
		if (root == null)return;
		
		recursiveInOrder(root.left);
		System.out.print(root.data + " ");
		recursiveInOrder(root.right);
	}
    public void iterativeInOrder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		Node tempNode = root;
	
		while(!stack.isEmpty()||tempNode!=null) {
			if (tempNode!=null) {
				stack.push(tempNode);
				tempNode = tempNode.left;
			}else {
	            tempNode = stack.pop();
				System.out.print(tempNode.data+" ");
				tempNode = tempNode.right;
			}
		}
	}
    public void recursivePostOrder(Node root) {
    	
		if(root==null)return ;
		
		recursivePostOrder(root.left);
		recursivePostOrder(root.right);
		System.out.print(root.data+" ");
	}
	public void iterativePostOrder(Node root) {
		
		if (root == null) {
			return;
		} 
		
		Node currentNode = root;
		Stack<Node> stack = new Stack<>();
		while(!stack.isEmpty()||currentNode!=null) {
			if (currentNode!=null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}else {
				Node tempNode = stack.peek().right;
				if (tempNode == null ) {
					tempNode = stack.pop(); 
					System.out.print(tempNode.data+" ");
					while (!stack.isEmpty()&&tempNode== stack.peek().right) {
						tempNode = stack.pop();
						System.out.print(tempNode.data+" ");
					}
				}else {
					currentNode = tempNode;
				}
			}
		}
	    
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.createBinaryTree();
		
		tree.recursivePreOrder(tree.root);
	    System.out.println();
		tree.iterativePreOrder(tree.root);
		System.out.println();
		tree.recursiveInOrder(tree.root);
		System.out.println();
		tree.iterativeInOrder(tree.root);
		System.out.println();
		tree.recursivePostOrder(tree.root);
		System.out.println();
		tree.iterativePostOrder(tree.root);
	}
}
