package datastructure.array;



//Find elements with maximum difference in an  array
//such that larger numbers appear after the smaller number
public class Array09FindTwoElementsWithMaximumDifference {

	public static void maxDifference(int arr[]) {
		int min = arr[0];
		int maxDiff = arr[1] -min;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]-min>maxDiff) {
				maxDiff = arr[i] - min;
			}
			if(arr[i]<min) min = arr[i];
			
		}
		
		System.out.println(maxDiff);
	}
	
	public static void main(String[] args) {
		int[] arr = {3,19,5,7,13,25,5,1};
		maxDifference(arr);
	}
}
