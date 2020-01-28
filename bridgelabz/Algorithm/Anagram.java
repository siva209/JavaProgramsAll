package com.bridgelabz.Algorithm;

import com.bridgelabz.utilAlgorithm.UtilAlgorithm;

public class Anagram {
	public static void main(String[] args) {

		if (UtilAlgorithm.anagramcheck("siva", "visa")) {

			System.out.println("The two strings are" + " anagram of each other");
		} else {
			System.out.println("The two strings are not" + " anagram of each other");
		}

	}
}


