package datastructure.array;


/*
 * sorted array having distinct elements.
 * find all the pairs whose sum = target.
 * if no such pairs output -1
 */

public class Array05FindPairsWhoseSumEqualsAGivenTarget {
   
	public void findPairs(int arr[],int targetSum) {
		
		int low = 0;
		int high = arr.length-1;
		
		boolean pairExists = false;
		while (low<high) {
			
			if (arr[low] + arr[high]>targetSum) {
				high--;
			}else if(arr[low]+ arr[high]<targetSum) {
				low++;
			}else if(arr[low]+ arr[high] == targetSum) {
				pairExists = true;
				System.out.println(arr[low]+" "+arr[high]);
				high--;
				low++;
			}
		}
		
		if (!pairExists) {
			System.out.println("no such pairs.");
		}
		
	}
	
	public static void main(String[] args) {
		Array05FindPairsWhoseSumEqualsAGivenTarget a = new Array05FindPairsWhoseSumEqualsAGivenTarget();
		int arr[] = {2,4,5,6,7,9,12};
		int targetSum = 5;
		a.findPairs(arr, targetSum);
		
		
	}
}
