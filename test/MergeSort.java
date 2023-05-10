package test;
import java.util.Arrays;

public class MergeSort {

	public int[] sort(int[] arr) {
		
		if (arr.length==1) {
			return arr;
		}
		int mid = arr.length/2;
		
		int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
		
	}
	public int[]merge(int[]left,int[]right){
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int[] temp = new int[left.length + right.length];
		
		while(i < left.length && j<right.length) {
			
			if (left[i]<right[j]) {
				temp[k]=left[i];
				i++;
			}else {
				temp[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length) {
			temp[k] = left[i];
			i++;
			k++;
		}
		
		while(j<right.length) {
			temp[k] = right[j];
			j++;
			k++;
		}
		
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		MergeSort m = new MergeSort();
		int[] arr = {5,3,24,12,6,4};
		arr =m.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
