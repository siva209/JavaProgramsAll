package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.utilAlgorithm.UtilAlgorithm;

public class MonthlyPayment {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter principal ,year and rate");
		double p = s.nextDouble();
		double y = s.nextDouble();
		double r = s.nextDouble();
		s.close();
		System.out.println("mothly payment is " + UtilAlgorithm.monthlyPayment(p, y, r));
	}


}
	
