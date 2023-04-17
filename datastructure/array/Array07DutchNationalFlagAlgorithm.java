package datastructure.array;
  
import java.util.Arrays;

//sorting an array of only 0,1,and 2.
public class Array07DutchNationalFlagAlgorithm {

	public void sort012(int arr[]) {
		int i = 0;
		int j = 0;
		int k = arr.length - 1;
		
		while(i<=k) {
			if (arr[i]== 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr [j] = temp;
				i++;
				j++;
			}else if (arr[i]==1) {
				i++;
			}else if(arr[i]==2) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr [k] = temp;
				k--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Array07DutchNationalFlagAlgorithm a = new Array07DutchNationalFlagAlgorithm();
  
		int[] arr = new int[]{1,1,0,2,0,1,2,2,1,0};
		a.sort012(arr);
		System.out.println(Arrays.toString(arr));
	}
}
