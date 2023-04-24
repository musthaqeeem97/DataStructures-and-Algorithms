package datastructure.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array03TwoSum {

	
    public int[] twoSum(int[] nums, int target) {
	     
    	int[] res = new int[2];
    	
    	for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j]==target ) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
    	
    	return new int[0];
	    }
    
    //n logn complexity using single loop
  

	    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array.");
		int size = s.nextInt();
		int[] nums = new int[size];
		System.out.println("enter the elements of the array.");
		for (int i = 0; i < size; i++) {
			nums[i]= s.nextInt(); 
		}	
		Array03TwoSum arr = new Array03TwoSum();
		System.out.println("enter target:");
		int target = s.nextInt();
		int[]res = arr.twoSum(nums, target);
		
		for (int i : res) {
			System.out.println(i);
		}
		
	}
}
