package quicksort;

import java.util.Arrays;

public class QuickSort {

	public void sort(int[]  arr,int low , int high) {
		if(low>=high) return;
		
		int start = low;
		int end = high;
		int mid = (start + end)/2;
		int pivot = arr[mid];
		
		while (start<=end) {
			
			while (arr[start]<pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			} 
	
			if (start<=end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			
			sort(arr, low, end);
			sort(arr, start, high);
		}
		
	}
	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		int[] arr = {5,3,24,12,6,4};
        q.sort(arr,0,arr.length-1);
    	System.out.println(Arrays.toString(arr));
	
	}
}
