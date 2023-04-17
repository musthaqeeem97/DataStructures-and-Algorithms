package recursionanddynamicprogramming;

public class LinearSearchUsingRecursion {
	
	public int linearSearch(int[]arr,int target,int index) {
		 
		if(index == arr.length)return -1;
		
		if (arr[index] == target) return index;
		else {
			return linearSearch(arr, target, index+1);
		}
		
	}

	public static void main(String[] args) {
		LinearSearchUsingRecursion ln = new LinearSearchUsingRecursion();
		int arr[] = {1,2,3,4,17,25,30};
		int index = ln.linearSearch(arr, 25, 0);
        System.out.println(index);
		
	}
}
