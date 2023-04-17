package bubblesort;

import java.util.Arrays;


public class BubbleSort {
   
	public void sort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(isSwapped == false) break;
		}
	}

	//using recursion
	public void bubbleSort(int[] arr, int n){
		
		if(n==1) return;
		for (int i = 0; i < n-1; i++) {
			if (arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		bubbleSort(arr, n-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {5,3,24,12,6,4};
		BubbleSort b = new BubbleSort();
		
		b.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
