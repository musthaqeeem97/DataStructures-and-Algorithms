package DoublyLinkedList;

import java.util.NoSuchElementException;


public class DoublylinkedList {

	private Node head;
	private Node tail;
	private static int length;
	
	public DoublylinkedList() {
		this.length = 0;
	}
	
	private class Node {
		private int data;
		private Node next;
		private Node previous;
		
	public Node(int data) {
		this.data = data;
		length++;
	}
	
	}
	public void insertFirst(int data) {
		Node newNode =new Node(data);
		if (head == null) {
			head = newNode;
			tail = head;
			return;
		}
		
		head.previous = newNode;
		newNode.next = head;
		head = head.next;
		
	}
	public void insertLast(int data) {
		if (head == null) {
			head = new Node(data);
			tail = head;
			return;
		}
		tail.next = new Node(data);
		tail.next.previous = tail;
		tail = tail.next;
	
	}
	
	public void displayForward(){
		if (length != 0) {
		 Node current = head;
		 while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		   }
		} System.out.print("null");
	}
	
	public void displayBackward() {
		if (length != 0){
		Node current = tail;
		
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.previous;
		}
		System.out.print("null");
	}
		
		}
	
	public void  deleteFirst() {
		if(head == null)  throw new NoSuchElementException("list is empty.");
		Node tempNode = head;
		if (head == tail) tail = null;
		else head.next.previous = null;
		
			head = head.next;
			tempNode.next = null;
	
	}
	
	public void deleteLast() {
		if(tail == null) {
			System.out.println(" list is empty");
			return;
		}
		if(tail == head) head = null;
		else tail.previous.next = null;
		tail = tail.previous;
			
		
	}
	
	
}
 