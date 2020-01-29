package com.bridgelabz.DS;

import java.util.Scanner;

public class Palindrom extends Dequeue {

	public static void main(String[] args) {
		System.out.println("enter any string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Dequeue d = new Dequeue();

		for (int i = s.length() - 1; i >= 0; i--) {
			d.insertAtrear(s.charAt(i));
			String reverse = " ";
			while (!d.isEmpty()) {
				reverse = reverse + s.charAt(i) + d.remove();
			}
			if (s.equals(reverse)) {
				System.out.println("the given  string is palindrom=" + reverse);
			} else {
				System.out.println("the given  string is  not a palindrom=" + reverse);
			}

		}
	}
}