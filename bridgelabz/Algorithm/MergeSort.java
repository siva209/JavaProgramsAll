package com.bridgelabz.Algorithm;

import com.bridgelabz.utilAlgorithm.UtilAlgorithm;

public class MergeSort {
	
		private static int l;
		private static int r;
		private static int m;

		public static void main(String[] args) {
			
			int[]arr= {12,4,3,6,7,30,21};
			int n=arr.length;
			
			System.out.println("The given array ");
			UtilAlgorithm.sortarray(arr);
		
		UtilAlgorithm.merge(arr,0,arr.length-1);
			
		    System.out.println("sorted array");
		    UtilAlgorithm.sortarray(
		    		arr);
		
		}

		
}

