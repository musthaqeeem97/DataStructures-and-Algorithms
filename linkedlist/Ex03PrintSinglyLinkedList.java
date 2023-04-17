package linkedlist;

import linkedlist.Ex02CreateSinglyLinkedList.ListNode;

public class Ex03PrintSinglyLinkedList {

	private ListNode head;
	
	private class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}	
		
	}
	
	private void display() {
		
		ListNode current = head;
		
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		Ex03PrintSinglyLinkedList sl = new Ex03PrintSinglyLinkedList();
		
		sl.head = sl.new ListNode(3);
		
		ListNode second = sl.new  ListNode(9);
		ListNode third = sl.new  ListNode(4);
		ListNode fourth = sl.new  ListNode(8);
		
		sl.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sl.display();
		
	}
}
