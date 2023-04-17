package binarysearch;

public class Ex01FindCeilingAndFloorOfANumber {

	
	//ceiling : smallest number greater than or equal to the target
	public int ceilingIndex(int arr[],int target) {
		int start = 0;
		int end = arr.length -1;
		
		if(target > arr[end]) return -1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]== target) return mid;
			if(target<arr[mid]){
				end = mid-1;
			}else {
				start = mid +1;
			}
			
		}
		
		return start;
		
	}
	
	//floor --> largest number less than or equal to the target
	public int floorIndex(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]== target) return mid;
			if(target<arr[mid]){
				end = mid-1;
			}else {
				start = mid +1;
			}
			
		}
		
		return end;
		
	}
	
	public static void main(String[] args) {
		Ex01FindCeilingAndFloorOfANumber b = new Ex01FindCeilingAndFloorOfANumber();
		int[] arr = {3,6,7,10,13,16,16,18,21};
		int target = 17;
	    int index = b.ceilingIndex(arr, target);
	    if(index!=-1) {
	    	System.out.println(arr[index]);
	    }else {
			System.out.println("not found");
		}
	    
	    index = b.floorIndex(arr, 10);
	    if(index!=-1) {
	    	System.out.println(arr[index]);
	    }else {
			System.out.println("not found");
		}
	    
		
	}
}
