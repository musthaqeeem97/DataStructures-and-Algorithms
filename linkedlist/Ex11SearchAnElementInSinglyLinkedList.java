package linkedlist;

public class Ex11SearchAnElementInSinglyLinkedList {

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
	
	public void deleteElementFromGivenPosition(int position) {
		if (position == 1) {
			head = head.next;
			return;
		}
		ListNode previous = head;
		int count = 1;
		
		while (count < position-1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = current.next;
	    
	}
	
	public boolean searchElement(int element) {
		
		ListNode current = head;
		
		while (current.next != null) {
		   if (current.data == element) {
			return true;
			}
		   current = current.next;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
	    Ex11SearchAnElementInSinglyLinkedList sl = new Ex11SearchAnElementInSinglyLinkedList();
		sl.insertLast(5);
		sl.insertLast(3);
		sl.insertLast(9);
		sl.insertLast(7);
		sl.insertLast(1);
		
		sl.display();
		System.out.println();
		String result = sl.searchElement(5)? "element found":"element not found";
		System.out.println(result);
		
		
	}

}
