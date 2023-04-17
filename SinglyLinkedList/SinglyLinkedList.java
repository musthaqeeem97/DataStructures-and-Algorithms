package SinglyLinkedList;


public class SinglyLinkedList {

	 private Node head;
	 static int size;
	
	 class Node{
		 private int data;
		 private Node next; 
		 
		 public Node(int data) {
		 this.data = data;
		 this.next = null;
		 size++;
		}
		 
		 
	 }
	  public Node getNode(int index){
	        Node node = head;
	        for (int i = 0; i < index; i++) {
	            node = node.next;
	        }
	        return node;
	    }
	  
	 public void reverse(){
	    
		Node prev = null;
		
		while(head != null) {
			Node next = head.next;
			head.next = prev;
			prev = head;
			head = next;
			}
		
        head = prev;
	    }
	 
	 public void deleteFirstElement() {
			
			if(head == null) return ; 
			
		    Node temp = head;
			head = head.next;
			temp.next = null;
		
		}
		public void deleteLastElement() {
			
			if (head==null || head.next == null) return;
			
			Node previous = null;
			Node current = head;
			
			while(current.next != null) {
				previous = current;
				current = current.next;
			}
			
			previous.next = null;
			
		
		}
		
	 
	 public void deleteValueEveryOccurance(int data) {
		 Node currentNode = head;
		 Node previousNode = null;
		 
		 if(head == null || head.next == null) return;
		 
		 while (currentNode.next != null) {
			 if(currentNode.data == data) {
				 if(previousNode != null) {
					 previousNode.next = currentNode.next;
					 size --;
				 }else {
					deleteFirstElement();
				}
				 
			 }else {
				 previousNode = currentNode;
			 }
			currentNode = currentNode.next;
		}
		 if(currentNode.data == data) deleteLastElement();
		 
	 }
	 
	 
	 public void insertBeforeposition(int data,int position) {
		 
		 if(position == 1) {
			 insertFirst(data);
			 return;
		 }
		 if (position == size+ 1) {
			insertLast(data);
			return;
		 }
		 
		Node current = head;
		int count = 1;
		
		while (count < position -1) {
			current = current.next;
			count++;
		}
		
		Node newNode = new Node(data);
		newNode.next = current.next;
		current.next = newNode;
		 
	}
	 
	 public void insertAfterPosition(int data, int position) {
		 
		 if(position == 1) {
			 insertFirst(data);
			 return;
		 }
		 if (position == size+ 1) {
			insertLast(data);
			return;
		 }
		 
		 int count = 1;
		 Node currentNode = head;
		 
		 while (count < position) {
			 currentNode = currentNode.next;
			 count++;
		 }
		 
		 Node newNode = new Node(data);
		 newNode.next = currentNode.next;
		 currentNode.next = newNode;
		 
		                                  
	 }
	 
	 public void insertBeforeValue(int searchValue, int data ) {
		 

		 if(searchValue == head.data) {
			 insertFirst(data);
			 return;
		 }
		 Node currentNode = head;
		
		 while (currentNode.next != null && currentNode.next.data !=searchValue ) {
			currentNode = currentNode.next;
		}
		 if(currentNode.next == null ) {
			 System.out.println("element not found");
			 return;
		 }
		 Node newNode = new Node(data);
		 
		 newNode.next = currentNode.next;
		 currentNode.next = newNode;
	 }
     public void insertAfterValue(int searchValue, int data ) {
		 

		 if(searchValue == head.data) {
			 insertFirst(data);
			 return;
		 }
		 Node currentNode = head;
		
		 while (currentNode.next != null && currentNode.data !=searchValue ) {
			currentNode = currentNode.next;
		}
		 if(currentNode.next == null ) {
			 System.out.println("element not found");
			 return;
		 }
		 Node newNode = new Node(data);
		 
		 newNode.next = currentNode.next;
		 currentNode.next = newNode;
	 }
	 public void insertFirst(int data) {
		 if (head == null) {
			 head = new Node(data);
			 return;
		 }
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
		 
	 }
	 
	 
	 
	 public void insertLast(int data) {
		 
		 if (head==null) {
			head = new Node(data); 
			return;
		 }
		 
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = new Node(data);
	 }
	 
	 public void display() {
		 Node current = head;
		 
		 
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
			
		}
		System.out.print("null");
		
	 }
	 
	 public void removeDuplicateOfSortedList() {
		 if(head == null) return;
		 
		 Node currentNode = head;
		 
		 while ( currentNode.next != null) {
			if (currentNode.data == currentNode.next.data) {
				currentNode .next = currentNode.next.next;
			}else {
				currentNode=currentNode.next;
			}
		}
	 }
	 
	 public void deleteAValueAtEveryOccurance(int data) {
		 Node tempNode = null;
		 
		 while(head!=null && head.data==data) {
			 tempNode = head;
			 head =head.next;
			 tempNode.next = null;
		 }
		 
		 if (head == null)return;
		 
		 Node currentNode = head; 
		 while(currentNode.next != null ) {
			 if (currentNode.next.data == data) {
				 tempNode = currentNode.next;
				 currentNode.next = tempNode.next;
				 tempNode.next = null;
			}else {
				currentNode=currentNode.next;
			}
			
			 
		 }
		 
	 }
	 
}
