package linkedlist;

public class Ex12PrintReverseASinglyLinkedList {

private ListNode head;
	
	private class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	public void display(ListNode head) {
		
		ListNode current = head;
		
		while(current != null) {
	   
			System.out.print(current.data + "-->");
		    current = current.next; 
		}
		
		System.out.print("null");
	  }
	
    public void printReverse(ListNode head) {
    	if ( head == null) {
            return;
        }
        
    	printReverse(head.next);
        System.out.println(head.data);
    }
	
	public ListNode reverse() {
		
		if (head == null)return head;
		
		ListNode next = null;
		ListNode previous = null;
		ListNode current = head;
		
		if (current != null ) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			
		}
		return previous;
	}

	public static void main(String[] args) {
		
	    Ex12PrintReverseASinglyLinkedList sl = new Ex12PrintReverseASinglyLinkedList();
		sl.head = sl.new ListNode(1);
		ListNode second = sl.new ListNode(5);
		ListNode third = sl.new ListNode(3);
		ListNode fourth = sl.new ListNode(65);
		ListNode fifth = sl.new ListNode(9);
		sl.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		sl.display(sl.head);
		System.out.println();
		sl.printReverse(sl.head);
		
	}

}
