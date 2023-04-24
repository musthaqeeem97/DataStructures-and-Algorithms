package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex01HashTableTwoSum {

	public int[] findTwoSumIndexes(int[] arr,int target) {
		int[] resultIndexes = new int[2];
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(!hashMap.containsKey(target - arr[i])) {
				hashMap.put(arr[i], i);
			}else {
				resultIndexes[1]= i;
				resultIndexes[0] = hashMap.get(target - arr[i]);
			}
		}
		return resultIndexes;
		
	}
	  public int[] twoSumOpitimized(int[] nums, int target) {
	    	
	    	Arrays.sort(nums); 
	        
	    	int[] res = new int[2];
	    	int start = 0;
	    	int end = nums.length -1;
	    	while (start<end) {
				if (nums[start] + nums[end]== target) {
					res[0] = nums[start];
					res[1] = nums [end];
					return res;
				}
				
				else if (nums[start]+ nums[end]<target) {
					start++;
				}
				else {
					end--;
				}
			}
	    	  	
	    	return new int[0];
		    }
	public static void main(String[] args) {
		Ex01HashTableTwoSum h = new Ex01HashTableTwoSum(); 
		int[] arr = {1,10,2,4,6,5,13};
		
		int[]result = h.findTwoSumIndexes(arr, 9);
		System.out.println(Arrays.toString(result));
	}
}
