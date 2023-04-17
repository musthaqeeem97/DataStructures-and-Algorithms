package datastructure.array;

import java.util.Arrays;

//may contains -ve values.
public class Array08SquaresofSortedArray {

	public int[] square(int arr[]) {
		
		int [] res = new int[arr.length];
		int i = 0;
		int j = arr.length -1;
		for (int k = res.length-1 ; k>=0 ; k--) {
			if(Math.abs(arr[i])>Math.abs(arr[j])) {
				res[k] = arr[i]*arr[i];
				i++;
			}else {
				res[k] = arr[j]*arr[j];
				j--;
			}
		}return res;
	}
	public static void main(String[] args) {
		Array08SquaresofSortedArray a = new Array08SquaresofSortedArray();
		 int[] arr= {-15,-7,-4,-3,-1,0,3,6,9,12};
		int[] res = a.square(arr);
		 System.out.println(Arrays.toString(res));
	}
}
