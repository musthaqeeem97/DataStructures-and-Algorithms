package binarysearch;


public class BinarySearch {
	 public int findIndexBinarySearch(int[] arr,int key) {
		 int low = 0;
		 int high = arr.length - 1;
		 while(low<=high) {
			 int mid = (low + high)/2;
			 if(arr[mid] == key)return mid;
			 if(key<arr[mid]) {
				 high = mid - 1;
			 }else {
				 low = mid + 1;
			 }
		 
		 }return -1;
		
	}
	 public int binarySearchRecursion(int[] arr,int low, int high, int key) {
		  if (low>high) return -1;
		  int mid = (low + high)/2;
		  if (arr[mid]== key) return mid;
		  if (key<arr[mid]) {
			return binarySearchRecursion(arr, low, mid-1,key);
			}else {
				return binarySearchRecursion(arr, mid+1, high, key);
			}
		  
	 }
	 
	 public static void main(String[] args) {
		int[] arr = {1,24,43,65,85,89,100};
	    BinarySearch b = new BinarySearch();
	    int index = b.findIndexBinarySearch(arr,89);
	    System.out.println(index);
	    index = b.binarySearchRecursion(arr, 0, arr.length -1, 89);
	    System.out.println(index);
	    
		
	}

}
