package datastructure.array;

import java.util.Scanner;

public class Array02MoveZeroesToTheEnd {

	private static void display( int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static int[] moveZeroesToTheEnd(int[] arr) {
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!= 0 && arr[j]==0 ) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			if (arr[j]!= 0) j++;
		}
		return arr;
		
	}

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array.");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements of the array.");
		for (int i = 0; i < size; i++) {
			arr[i]= s.nextInt(); 
		}
		display(arr);
		int[] result = moveZeroesToTheEnd(arr);
		System.out.println("after moving zeros to end of the array;");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		s.close();
		
		
	}
	
}
