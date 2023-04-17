package linkedlist;


public class Ex08DeleteFirstNodeSinglyLinkedList {


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
	
	public ListNode deleteFirstElement() {
		
		if(head == null) return null; 
		
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	
	public static void main(String[] args) {
		
	    Ex08DeleteFirstNodeSinglyLinkedList sl = new Ex08DeleteFirstNodeSinglyLinkedList();
		sl.insertLast(5);
		sl.insertLast(3);
		sl.insertLast(9);
		sl.insertLast(7);
		sl.insertLast(1);
		
		sl.display();
		System.out.println();
		ListNode temp = sl.deleteFirstElement();
		sl.display();
		System.out.println();
		System.out.println("deleted element: " + temp.data );
	}
}
