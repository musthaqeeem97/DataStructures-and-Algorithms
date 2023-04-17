package binarysearch;

public class Ex02SmallestLetterGreaterThanTarget {

	//if the  element o be returned is higher than the elements in the array return the first element. 
	public char smallestLetter(char arr[],char target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]== target) return arr[mid+1];
			if(target<arr[mid]){
				end = mid-1;
			}else {
				start = mid +1;
			}
			
		}
	
		return arr[start%arr.length];
		
	}
	
	public static void main(String[] args) {
		
		char[] arr = {'c','e','f','i','k','0'};
		Ex02SmallestLetterGreaterThanTarget s = new Ex02SmallestLetterGreaterThanTarget();
		System.out.println(s.smallestLetter(arr,'y'));
	}
	
}
