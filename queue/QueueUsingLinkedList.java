package queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingLinkedList {
 
	private Node front;
	private Node rear;
	
	private int length;
	
	public QueueUsingLinkedList() {
		this.length = 0;
	}
	
	private class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	public int length() {
		return length;
	}
	public boolean isEmpty () {
		return length == 0;
	}
	
	public void enqueue(int data) {
		Node tempNode = new Node(data);
		if (isEmpty()) {
			front = tempNode;
		}else {
			rear.next = tempNode;
		}

		rear = tempNode; 
		length++;
	}  
	public int dequeue() {
		
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		int deletedElement = front.data;
        front = front.next;
        length--;
        if(front==null) {
        	rear = null;
        }
        	return deletedElement;
	}
	public void display() {
		
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
	
		Node current = front;
		
		while(current != null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null");
		
	}
	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		int arr[] = {6,3,7,2,8};
		
		for (int i : arr) {
			q.enqueue(i);
		}
		q.display();
		
		System.out.println();
		System.out.println("deleted elements:");
	
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.display();
		System.out.println();
		System.out.println(q.dequeue());
	
		//System.out.println(q.dequeue());
		
	}
}
