package heapsort;

import java.util.Arrays;

public class HeapSort {
	
	
	public void sort(int[]heap,int n) {
			
		for (int i = n/2 - 1 ; i >= 0; i--) {
		    maxHeapify(heap, n, i);    
	 	}
		
		for (int i = n-1; i >=0; i--) {
			
			//swpping the max to to last position every time
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			
			//heapifying the disordered heap
			maxHeapify(heap, i, 0);
			
		}
	}

	public void maxHeapify(int []arr, int n, int i) {
		int largest = i;
		int left = 2*i + 1;
		int right = 2*i +2;
	
		if(left<n && arr[left]> arr[largest]) {
			largest = left;
		}
		
		if(right<n && arr[right]>arr[largest]) {
			largest = right;
		}
		
		if(i!=largest) {
			//swap
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapify(arr, n, largest);
		}
		}
	
	
	public static void main(String[] args) {
		
		HeapSort heapSort = new HeapSort();
		int arr[] = {5,3,24,12,6,4};
		
		heapSort.sort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
