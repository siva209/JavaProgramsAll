package com.bridgelabz.Algorithm;

import com.bridgelabz.utilAlgorithm.UtilAlgorithm;

public class DayOfWeek {

	
	private static int month;
	private static int year;
	private static int day;
	

	public static void main(String[] args) {
		
		
		String[] dayofweek = { "Invalid", "Sun", "Mon", "Tue", 
                "Wed", "Thur", "Fri", "Sat" }; 
int y = 2020, m = 1, d = 18; 
System.out.println(dayofweek[UtilAlgorithm.method(y, m, d)]); 
} 
}


	

