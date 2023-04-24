package selectionsort;

import java.util.Arrays;

import binarysearch.Ex03FindStartAndLastPosition;


public class SelectionSort {
	
	public void sort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			//find a index of the minimum
			int min = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<arr[min]) {
					min = j;
				}
			}
		 
			//swap
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}	
			
		
	}

			
			

	public static void main(String[] args) {
		int[] arr = {5,3,24,12,6,4};
		SelectionSort b = new SelectionSort();
		
		b.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
