package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	private Node root;
	
	class Node{
	private	int data;
	private	Node left;
	private	Node right;
	
	public Node(int data) {
		this.data = data;
	}
	}
	public void insert(int data) {
		root = insert(root, data) ;
	}
	public Node insert(Node root,int  data) {
		if (root==null) {
			root = new Node(data);
			System.out.println("inserted "+root.data);
			return root;
		}
		if(data<root.data) {
			root.left = insert(root.left, data);
	    }else {
	    	root.right = insert(root.right, data);
	    }
		return root;
	}
	public void recursivePreOrder(Node root) {
		if (root == null)return;
		
		System.out.print(root.data + " ");
		recursivePreOrder(root.left);
		recursivePreOrder(root.right);
	}
	
	//in-order
	public void dfs(Node root) {
		if (root == null)return;
		
		recursivePreOrder(root.left);
		System.out.print(root.data + " ");
		recursivePreOrder(root.right);
	}
	
	 public void postOrder(Node root) {
	    	
			if(root==null)return ;
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	//level-order
	public void bfs(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
		    System.out.print(tempNode.data+ " ");
		    if (tempNode.left != null) {
				queue.offer(tempNode.left);
			}
		    if (tempNode.right!=null) {
				queue.offer(tempNode.right);
			}
		}
	}
	//contains
	 private boolean containsNode(Node node, int data) {
	        if (node == null) {
	            return false;
	        }

	        if (data == node.data) {
	            return true;
	        } else if (data < node.data) {
	            return containsNode(node.left, data);
	        } else {
	            return containsNode(node.right, data);
	        }
	    }
	public Node search(Node root,int data) {
		if (root==null||root.data==data) {
			return root;
		}
		if (data<root.data) {
			return search(root.left, data);
		}else {
			return search(root.right, data);
		}

	}
	public int findMax(Node root) {

		return root.right==null?root.data:findMax(root.right);
	}
	public int findMin(Node root) {
		
		return root.left==null?root.data:findMin(root.left);
	}
	
	public void deleteNode(int data) {
		root = deleteNode(root, data);
	}
	public Node deleteNode(Node root, int data) {
		
		if (root==null) {
			return null;
		}
		
		if (root.data == data) {
			if (root.left==null && root.right==null) {
				return null;
			}
			else if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			else {
				int smallestRightValue = findMin(root.right);
				root.data = smallestRightValue;
				root.right = deleteNode(root.right,smallestRightValue);
				return root;
			}
		}
		else if (data<root.data) {
			root.left = deleteNode(root.left,data);
		}
		else {
			root.right = deleteNode(root.right, data);
		}
		return root;
		
	}
	
	public int findClosestValue(Node root,int target) {
		
		 int closest = root.data;
		 while (root!=null) {
			if (Math.abs(root.data-target)<Math.abs(closest-target)) {
				closest = root.data;
			}
			root = target<root.data?root.left:root.right;
				
			}
		return closest;
	}
	public boolean validate(Node root,int min ,int max) {
		if (root==null) {
			return true;
		}
		if(root.data>max|| root.data<min) {
			return false;
		}
		boolean left = validate(root.left, min, root.data);
		if (left) {
			boolean right = validate(root.right, root.data, max);
			return right;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert( 5);
		tree.insert( 4);
		tree.insert( 3);
		tree.insert( 6);
		tree.insert( 7);
		tree.insert( 1);
		tree.recursivePreOrder(tree.root);
		
		
		System.out.println();
		
		//contains
		boolean res = tree.containsNode(tree.root, 1);
		System.out.println(res);
		res=tree.containsNode(tree.root, 0);
		System.out.println(res);
				
		//in order
		tree.dfs(tree.root);
		System.out.println();
		
		//level order
		tree.bfs(tree.root);
		
		//delete
		tree.deleteNode(5);
		System.out.println();
		tree.bfs(tree.root);
		
		System.out.println();
		
		
	    //validation
	    System.out.println(tree.validate(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	    
	    System.out.println(tree.findClosestValue(tree.root, 2));
	}
	
	
}
