package linkedlist;


public class Ex05InsertFirstSinglyLinkedList {

	private ListNode head;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			
			this.data = data;
			this.next = null;
		}
		
	}
	
	public void insertFirst(int data) {
		
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void display() {
		
		ListNode current = head;
		
	    while(current != null) {
	    	System.out.print(current.data + "-->");
	    	current = current.next;
	    }
	    System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		Ex05InsertFirstSinglyLinkedList sl = new Ex05InsertFirstSinglyLinkedList();
		
		sl.insertFirst(6);
		sl.insertFirst(3);
		sl.insertFirst(28);
		sl.insertFirst(7);
		sl.insertFirst(5);
		sl.insertFirst(2);
	
		sl.display();
		
		
	}
	
	
}
