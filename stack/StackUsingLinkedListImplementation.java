package stack;

import java.util.EmptyStackException;
import java.util.Stack;


public class StackUsingLinkedListImplementation {

	private Node top;
	private int length;
	
	public StackUsingLinkedListImplementation() {
		this.length = 0;
	}
	
	private class Node {
		
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	//push() in stack return the data whose type is that of the argument; 
	public int push(int data) {
		Node tempNode = new Node(data);
		tempNode.next = top;
		top = tempNode;
		length++;
		return top.data;
	}
	
	public int pop() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		 Node temp = top; 
		top = top.next;
		length--;
		return temp.data;
	}
	
    public int peek() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
    
    public void display() {
		if (isEmpty()) {
			System.out.println("null");
			return;
		}
       
        Node tempNode = top;
        while (tempNode != null) {
        	
        	System.out.print(tempNode.data + "-->");
			tempNode = tempNode.next;
			
		}
        System.out.print("null");
	}
    
    public static void main(String[] args) {
		StackUsingLinkedListImplementation stack = new StackUsingLinkedListImplementation();
		
		int[] arr = {4,2,1,9};
		for (int i : arr) {
			stack.push(i);
		}
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println();
		stack.display();
		stack.pop();
		System.out.println();
		stack.display();
		
		
	}
	
	
	
	
}
