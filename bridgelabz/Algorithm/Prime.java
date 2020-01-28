package com.bridgelabz.Algorithm;

import com.bridgelabz.utilAlgorithm.UtilAlgorithm;

public class Prime {
	private static int n;


	public static int getN() {
		return n;
	}


	public static void setN(int n) {
		Prime.n = n;
	}
	public static void main(String[] args) {
		
		System.out.println("prime between 0 to 1000");
		UtilAlgorithm.prime();
		System.out.println("prime no between 0 to 1000 also pallindrome");
		UtilAlgorithm.primePallindrome();
		System.out.println("prime and anagrams");
		UtilAlgorithm.primeAnagrams();
	}
}
