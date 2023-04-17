package SinglyLinkedList;

import datastructure.array.Array06MergeTwoSortedArrays;

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
			
			if (head==null ) return;
			if (head.next == null) {
				head = head.next;
				return;
			}
			
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
		 

		 
		 Node currentNode = head;
		
		 while (currentNode != null && currentNode.data !=searchValue ) {
			currentNode = currentNode.next;
		}
		 if(currentNode == null ) {
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
	  public Node merge(Node a, Node b) {
		  
         Node dummyNode = new Node(0);
         Node tailNode = dummyNode;
         
         while(a!=null && b != null ) {
        	 if(a.data< b.data) {
        		 tailNode.next = a;
        		 a = a.next;
        	 }else {
				tailNode.next = b;
				b = b.next;
			}
        	 tailNode = tailNode.next;
         }
         
         if(a == null) {
        	 tailNode.next = b;
         }
         else {
        	 tailNode.next = a;
         }
         return dummyNode.next;
	 }
	  public static void main(String[] args) {
		SinglyLinkedList l = new SinglyLinkedList();
		

		   int[] arr = {1,4,6,7,9};

		     for(int data : arr) {
		    	 l.insertLast(data);
		     }
		    
		  
		     
		     l.display();
		     System.out.println();
		     SinglyLinkedList l2 = new SinglyLinkedList();
		     int[] arr2 = {2,5,6,8,11};

		     for(int data : arr2) {
		    	 l2.insertLast(data);
		     }
		     l2.display();
		     SinglyLinkedList res = new SinglyLinkedList();
		      res.head =res.merge(l.head,l2.head);
		     System.out.println();
		     res.display();
	      
	}
	  
	 
}
