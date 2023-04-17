package linkedlist;

public class Ex04LengthSinglyLinkedList {

   private ListNode head;
   
   
   private static class ListNode{
	   private int data;
	   private ListNode next;
	   
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
	   
	   
   }
   
   public void display(){
	   
	   ListNode current = head;
	   
	   while (current != null) {
		   System.out.print(current.data + "-->");
		   current = current.next;
	}
	   System.out.print("null");
   }
   
   public int length() {
	   if(head == null) {
		   return 0;
	   }
	   int count = 0;
	   ListNode current = head; 
	   while (current != null) {
		 count++;
		 current = current.next;
	}
	   return count;
   }
   
   public static void main(String[] args) {
	Ex04LengthSinglyLinkedList sl = new Ex04LengthSinglyLinkedList();
	sl.head = new ListNode(6);
	
	ListNode second = new  ListNode(7);
	ListNode third = new  ListNode(4);
	ListNode fourth = new  ListNode(8);
	
	sl.head.next = second;
	second.next = third;
	third.next = fourth;
	
	sl.display();
	System.out.println();
	int length = sl.length();
	System.out.println("length: "+ length);
	
}
   
}
