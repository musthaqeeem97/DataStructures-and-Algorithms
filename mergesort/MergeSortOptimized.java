package mergesort;

import java.util.Arrays;

public class MergeSortOptimized {

	public void sort(int[]arr, int start ,int end) {
		if(end-start==1) return;
			int mid = (start+end)/2;
			sort(arr, start, mid);
			sort(arr, mid, end);
			merge(arr,start,mid,end);
		
	}
	
	private void merge(int[] arr, int start, int mid, int end) {
		int i = start ;
		int j = mid;
		int k=0;
		int[]temp = new int[end - start];
		
		while(i<mid && j<end) {
			if(arr[i]< arr[j]) {
				temp[k] = arr[i];
				i++;
			}else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}     
		    while(i < mid) {
		    	
		    	temp[k] = arr[i];
		    	i++;
		    	k++;
		    }
            while(j < end) {
		    	
		    	temp[k] = arr[j];
		    	j++;
		    	k++;
		    }
           
            for (int l = 0; l < temp.length; l++) {
				
            	arr[start+l] = temp[l];
			}
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		MergeSortOptimized m = new MergeSortOptimized();
    	int[] arr = {5,3,24,12,6,4};
		
		
		m.sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
