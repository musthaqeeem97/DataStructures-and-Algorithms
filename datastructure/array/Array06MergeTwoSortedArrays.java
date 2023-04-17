package datastructure.array;

import java.util.Arrays;

public class Array06MergeTwoSortedArrays {
	
	public int[] mergeArrays(int[]arr1,int[]arr2) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		int[] res =new int [arr1.length + arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if (arr1[i]<arr2[j]) {
				res[k] = arr1[i];
				i++;
			}else {
				res[k] = arr2[j];
				j++;
			}
			k++;
			
		}
		while(i<arr1.length) {
		    res[k] = arr1[i];
		    i++;
		    k++;
		}
		while(j<arr2.length) {
		    res[k] = arr2[j];
		    j++;
		    k++;
		}
		
		return res;
	}

	public static void main(String[] args) {
		int[] arr1 = {2,4,6,9};
		int[] arr2 = {3,6,7,13,22,30};
		
		Array06MergeTwoSortedArrays a = new Array06MergeTwoSortedArrays();
		
		int[] res =a.mergeArrays(arr1, arr2);
		
		System.out.println(Arrays.toString(res));
	}
}
