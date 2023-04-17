package datastructure.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array10LargestOddNumberinArray {
 
	public int getLargestOddNum(List<Integer> list) {
		
		int result = 0;
		
		for(Integer number : list) {
		result = !(number % 2 == 0)? number	: result;
		}
		return result;
	}
	public static void main(String[] args) {
		Integer[] arr = {55,3,2,1,144,7,87,213,4,4,22,6,45,31} ;
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		
		Array10LargestOddNumberinArray a = new Array10LargestOddNumberinArray();
		int largestOdd = a.getLargestOddNum(list);
		System.out.println(largestOdd);
	}
}
