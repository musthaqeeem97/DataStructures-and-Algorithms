package datastructure.array;

import java.util.Scanner;

public class Array01FindingTheSecondMaximum {
	
	private static void display( int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static int findSecondMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];
			}
			else if (arr[i]>secondMax && arr[i]!=max) {
				
				secondMax = arr[i];
			}
			
		} return secondMax;
		
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
		int secondmax =findSecondMax(arr);
		System.out.println("SECOND MAX:"+secondmax);
		s.close();
		
		
	}
	
	
}
