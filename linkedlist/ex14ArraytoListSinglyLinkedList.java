package linkedlist;


public class ex14ArraytoListSinglyLinkedList {


	private ListNode head;
	static int size;
	


	
	private class ListNode{
		
		private int data;
		private ListNode next;
		
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
			size++;
			
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
	
	public void arrayToList(int[] arr) {
		
		for(int element : arr ) {
			insertlast(element);
		}
	}
	
	public void linkedListToArray(ListNode head) {
		
		if(head == null) return;
		ListNode current = head;
		int[] arr = new int[size-1];
		
		int count = 0;
		while (current.next != null) {
            arr[count] = current.data;
            current = current.next;
            count++;
		}
			System.out.println("elements of the array:");
			for(int data : arr) {
				System.out.println(data);
			}
		}
	
	
	public static void main(String[] args) {
		
		ex14ArraytoListSinglyLinkedList sl = new ex14ArraytoListSinglyLinkedList();
		
		int[]arr = {1,4,6,3,5,2};
		
	    sl.arrayToList(arr);
		
		sl.display();
		System.out.println();
		sl.linkedListToArray(sl.head);
	}
}
