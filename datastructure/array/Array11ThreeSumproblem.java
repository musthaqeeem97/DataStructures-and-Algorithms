package datastructure.array;

import java.util.Arrays;

//GIven an array of distinct integers print all triplets in the array 
//so that they will add up to a specific target.
//the triplets should be sorted in ascending order.
public class Array11ThreeSumproblem{

	public void printTriplets(int[] arr,int target) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length-2; i++) {
			int j =i+1;
			int k = arr.length - 1;
			
			while (j<k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum == target) {
					System.out.print(arr[i]+ " "+ arr[j]+ " "+arr[k] );
					System.out.println();
					j++;
					k--;
				}else if(sum<target) {
					
					j++;
				} else {
                  k--;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		Array11ThreeSumproblem s = new Array11ThreeSumproblem();
		int[] arr = {5,3,2,6,1,8,0,4};
		s.printTriplets(arr, 6);
		
		
		
	}
}