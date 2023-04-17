package linkedlist;

public class Ex07InsertAtPositionSinglyLinkedList {

private ListNode head;
	
	private class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	public void display() {
		
		ListNode current = head;
		
		while(current != null) {
	   
			System.out.print(current.data + "-->");
		    current = current.next; 
		}
		
		System.out.print("null");
	  }
	public void insertLast(int data) {
		
		if(head  == null ) {
			head = new ListNode(data);
			return;
		}
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new ListNode(data);
		
	}
	
	public void insertAtPosition(int data,int position) {
		ListNode node = new ListNode(data);
		if (position ==1) {
			node.next = head;
			head = node;
			return;
		}
		int count = 1;
		ListNode previous = head;
		
		while (count < position -1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = node;
		node.next = current;
		
		
		
	}
	public static void main(String[] args) {
		
		Ex07InsertAtPositionSinglyLinkedList sl = new Ex07InsertAtPositionSinglyLinkedList();
		sl.insertLast(5);
		sl.insertLast(3);
		sl.insertLast(9);
		sl.insertLast(7);
		sl.insertLast(1);
		
		sl.display();
		System.out.println();
		sl.insertAtPosition(45, 4);
		sl.display();
	}
}
