package doublylinkedlist;



public class Test {
	public static void main(String[] args) {
		DoublylinkedList list = new DoublylinkedList();

	    int[] arr = {1,2,3,4,5};

	    for(int data : arr) {
	   	 list.insertLast(data);
	    }
	    list.displayBackward();
	    System.out.println();
	    list.deleteLast();
	    list.deleteFirst();
	    list.deleteFirst();
	    list.deleteFirst();
	    list.displayForward();
	    list.deleteFirst();
	    System.out.println();
	    list.displayForward();
	    
	}
}
