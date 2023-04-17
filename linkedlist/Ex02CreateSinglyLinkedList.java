package linkedlist;


public class Ex02CreateSinglyLinkedList {
    
	private ListNode head;
	
	class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}	
	}
	
	public static void main(String[] args) {
		
		Ex02CreateSinglyLinkedList sl = new Ex02CreateSinglyLinkedList();
		
		sl.head = sl.new ListNode(4);
		
		ListNode second = sl.new  ListNode(7);
		ListNode third = sl.new  ListNode(4);
		ListNode fourth = sl.new  ListNode(8);
		
		sl.head.next = second;
		second.next = third;
		third.next = fourth;
		
		
	}
	
	
}
