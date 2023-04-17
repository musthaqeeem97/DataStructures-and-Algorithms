package linkedlist;

public class Ex06InsertatEndSinglyLinkedList {

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
	
	public void insertlast(int data) {
		if(head == null) {
			head = new ListNode(data);	
			return;
		}
		ListNode current = head;
		
		while(current.next != null) {
			
			current = current.next;
		}
		
		current.next = new ListNode(data);
	}
	
	public static void main(String[] args) {
		
		Ex06InsertatEndSinglyLinkedList sl = new Ex06InsertatEndSinglyLinkedList();
		
		sl.insertlast(5);
		sl.insertlast(3);
		sl.insertlast(9);
		sl.insertlast(7);
		sl.insertlast(1);
		sl.display();
	}
}
