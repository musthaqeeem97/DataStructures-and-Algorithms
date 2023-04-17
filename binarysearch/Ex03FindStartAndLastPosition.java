package binarysearch;

public class Ex03FindStartAndLastPosition {

	public int searchIndex(int[] arr,int target,boolean searchStartIndex) {
		
		int index = -1;
		int start = 0;
		int end = arr.length-1;
		
		
		
		while(start <= end) {
		int mid = start + (end-start)/2;
		
		if (target< arr[mid]) {
			end = mid -1;
			
		}else if ( target> arr[mid]){
			start = mid +1;
		}
		else {
			index = mid;
			if (searchStartIndex) {
				end = mid - 1;
				
			} else {
               start = mid + 1;
			}
		}
		
		}
		
		return index;
		
	}
	public static void main(String[] args) {
		Ex03FindStartAndLastPosition f = new Ex03FindStartAndLastPosition();
		
		int[] arr = {2,3,4,6,6,6,9,11,11};
		int target = 6;
		int startIndex = f.searchIndex(arr,target,true);
		int endIndex = f.searchIndex(arr,target,false);
		
		System.out.println(startIndex+" "+endIndex);
		
	}
}
