package com.bridgelabz.Algorithm;

import com.bridgelabz.utilAlgorithm.UtilAlgorithm;

public class InsertionSort {
	public static void main(String[] args){
		String[] arr ={"0","-9","-12","-4","4"};
		int count = 0;
		String sortedArray[] = UtilAlgorithm.sort_sub(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++){
		System.out.println(sortedArray[i]);
		}
		}
}



