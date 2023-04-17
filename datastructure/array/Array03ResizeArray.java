package datastructure.array;

import java.util.Scanner;

public class Array03ResizeArray {

	private static void display( int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static int[] resizeArray(int[] arr, int size) {
	

		int[] temp = new int[size];
		for (int i = 0; i < arr.length; i++) {
			temp[i]= arr[i];
		}
		arr = temp;
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
		System.out.println("enter ne size of the array.");
		size = s.nextInt();
		arr = resizeArray(arr,size);
		System.out.println("after resizing the array;");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		s.close();
		
		
	}
}
