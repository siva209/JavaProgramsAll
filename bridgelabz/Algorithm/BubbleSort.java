package com.bridgelabz.Algorithm;

	import com.bridgelabz.utilAlgorithm.UtilAlgorithm;
	public class BubbleSort {
	private static int[] arr;
	
	public static void main(String[] args) {
		 int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      System.out.println("Array Before Bubble Sort");

	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	      UtilAlgorithm.sortarray(arr);
	      System.out.println("Array After Bubble Sort");

	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	   }
}
