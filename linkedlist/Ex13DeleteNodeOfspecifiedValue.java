package linkedlist;

public class Ex13DeleteNodeOfspecifiedValue {
	

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
	
	public void deleteSpecifiedNode(int nodeData) {
	
		ListNode current = head;
		ListNode temp = null;
		
		if(current.data == nodeData) {
			head = head.next;
			return;
		}
		while (current != null && current.data != nodeData ) {
			temp = current;
			current = current.next;
		}
		
		if (current == null) {
			return;
		}
		temp.next = current.next;
	}

	public static void main(String[] args) {
		
	    Ex13DeleteNodeOfspecifiedValue sl = new Ex13DeleteNodeOfspecifiedValue();
		sl.head = sl.new ListNode(1);
		ListNode second = sl.new ListNode(5);
		ListNode third = sl.new ListNode(3);
		ListNode fourth = sl.new ListNode(5);
		ListNode fifth = sl.new ListNode(5);
		sl.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		sl.display(sl.head);
		System.out.println();
		sl.deleteSpecifiedNode(5);
		sl.display(sl.head);
		System.out.println();
		sl.deleteSpecifiedNode(9);
		sl.display(sl.head);
		System.out.println();
		sl.deleteSpecifiedNode(1);
		sl.display(sl.head);
		System.out.println();
		sl.deleteSpecifiedNode(5);
		sl.display(sl.head);
		System.out.println();
		sl.deleteSpecifiedNode(3);
		sl.display(sl.head);
		
	}
}
