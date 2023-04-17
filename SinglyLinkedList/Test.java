package SinglyLinkedList;

public class Test {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

	  /*   int[] arr = {1,2,2,5,5};

	     for(int data : arr) {
	    	 list.insertLast(data);
	     }
       */
	  /*  list.display();
	     System.out.println();
	    list.reverse();
	     System.out.println();
	     list.display();
	     
	    /* list.insertBefore(9, 4);
	     list.display();
	     list.insertAfter(1, 4);
	     System.out.println();
	     list.display();
	     
	     list.insertBeforeValue(9,8);
	    
	     System.out.println();
	     list.insertAfterValue(3, 3);
	     list.display();
	     System.out.println();
	     list.removeDuplicateOfSortedList();
	     list.display();
	     */
	     
	    /* list.deleteValueEveryOccurance(5);
	     list.display();
	     System.out.println();
	     //list.deleteValueEveryOccurance(1);
	    // list.display();
	     System.out.println();
	     list.deleteValueEveryOccurance(2);
	     list.display();
	     System.out.println();
	     list.deleteValueEveryOccurance(1);
	     list.display();
	    */
	     int arr2[] = {4,4,3,4,4,4};
	     for(int data : arr2) {
	    	 list.insertLast(data);
	     }
	     list.display();
	     System.out.println();
	     list.deleteAValueAtEveryOccurance(4);
	     list.display();
	}
}
