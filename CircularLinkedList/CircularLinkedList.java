package circularlinkedlist;


public class CircularLinkedList {

	private Node last;
	private static int length;
	
	public CircularLinkedList() {
		this.length = 0;
	}
	
	public class Node {
		private int data ;
		private Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	
	}
	
	public void createCircularLinkedList() {
	      Node first = new Node(1);
	      Node second = new Node(5);
	      Node third = new Node(10);
	      Node fourth = new Node(15);

	      first.next = second;
	      second.next = third;
	      third.next = fourth;
	      fourth.next = first;

	      last = fourth;
	 }
	
	public void insertFirst(int data) {
		if(last==null) {
			 last= new Node(data);
			 last.next = last;
			 return;
		}
		Node tempNode = new Node(data);
		tempNode.next = last.next;
		last.next = tempNode;
		
		
	}
	public void insertLast(int data) {
		if(last==null) {
			 last= new Node(data);
			 last.next = last;
			 return;
		}
		Node tempNode = new Node(data);
		tempNode.next = last.next;
		last.next = tempNode;
		last = tempNode;
	} 
	
	public void removeFirst() {
		if(last == null) return;
		Node tempNode = last.next;
		if (last.next == last) {
	         last = null;
	      }else {
		last.next = last.next.next;
		tempNode.next = null;
	      }
		length --;
		}
	
	
	public void display() {
		if (last == null) {
			System.out.println("null"); 
			return;
		}
		Node currentNode = last.next;
		
		while(currentNode != last && currentNode!=null) {
			System.out.println(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		
		System.out.println(last.data + " ");
			
        }
	
	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		
       /* list.insertFirst(8);
        list.insertFirst(82);
        list.insertFirst(83);
        list.insertFirst(81);
        list.insertFirst(89);
      */
		list.insertLast(8);
		list.insertLast(82);
		list.insertLast(85);
		list.insertLast(80);
		list.insertLast(6);
        list.display();
        
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        System.out.println();
        list.display();
        list.removeFirst();
        System.out.println("after deleting last node");
        list.display();
        list.removeFirst();
	}
		
}
