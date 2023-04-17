package linkedlist;

public class Ex09DeleteLastElementSinglyLinkedList {

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
	
	public ListNode deleteLastElement() {
		
		if (head==null || head.next == null) return head;
		
		ListNode previous = null;
		ListNode current = head;
		
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		
		previous.next = null;
		
		return current;
	}
	
	
	public static void main(String[] args) {
		
	    Ex09DeleteLastElementSinglyLinkedList sl = new Ex09DeleteLastElementSinglyLinkedList();
		sl.insertLast(5);
		sl.insertLast(3);
		sl.insertLast(9);
		sl.insertLast(7);
		sl.insertLast(1);
		
		sl.display();
		System.out.println();
		//ListNode temp = sl.deleteLastElement();
		sl.deleteLastElement();
		sl.deleteLastElement();
		sl.deleteLastElement();
		sl.deleteLastElement();
		//sl.deleteLastElement();
		//sl.deleteLastElement();
		sl.display();
		System.out.println();
		//System.out.println("deleted element: " + temp.data );
	}
}
