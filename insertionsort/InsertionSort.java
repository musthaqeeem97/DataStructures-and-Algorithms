package insertionsort;

import java.util.Arrays;



public class InsertionSort {
	
	public void insertionSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j>0; j--) {
				if (arr[j]<arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
			
		}
	}
	
    public static void main(String[] args) {
	
    	InsertionSort s = new InsertionSort();
    	int[] arr = {5,3,24,12,6,4};
		
		
		s.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
    }
	
}
