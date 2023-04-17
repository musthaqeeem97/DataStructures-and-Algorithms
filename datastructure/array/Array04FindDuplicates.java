 package datastructure.array;

import java.util.HashSet;
import java.util.Set;

/* 
 * prints elements having duplicates .
 */
public class Array04FindDuplicates {

	public void printDuplicates(int arr[]){
		
		Set <Integer> s = new HashSet<>();
		boolean duplicateExists = false;
		
		for (int i = 0; i < arr.length; i++) {
		
			if(s.contains(arr[i])) {
				duplicateExists = true;
				System.out.print(arr[i]+ " ");
			}else {
				s.add(arr[i]);
			}
			
		}
		
		if (!duplicateExists) System.out.println("no dupllicates found.");
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,2,4,7,8,5,3};
		int arr2[] = {2,3,4,5};
		
		Array04FindDuplicates a = new Array04FindDuplicates();
		a.printDuplicates(arr);
		System.out.println();
		a.printDuplicates(arr2);
	}
	}

