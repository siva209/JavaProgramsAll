package com.bridgelabz.datastructures;

public class Calendar {
public int day(int month,int day,int year) {
	int y=year -(14-month)/32;
	int x=y+y/4-y/100+y/400;
	int m=month+12*((14-month)/12)%7;
	int d=(day+x+(31*m)/12)%7;
	return d;
}
	public  static  boolean isLeapYear(int year) {
		if((year%4==0)&&(year%100!=0)){
			return true;
			
		}
		if((year %400==0)) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		Calendar c=new Calendar();
		int month=0;
		int year=0;
		String[]months= {"january","feb","march","april","may"," june","july","auguts","sep","oct","november","december"};
		int days[]= {0,31,28,31,30,31,30,31,30,31,30,31};
		if(month==2&&isLeapYear(year))days[month]=29;
		System.out.println( " "+months[month]+ " "+year);
		System.out.println("sun,mon,tue,wed,thu,fri,sat");
		int d=c.day(1, 28, 2020);
		System.out.println(d);
		for(int i=0;i<d;i++) {
			System.out.println("");
		}
		for(int i=1;i<=days[month];i++) {
			System.out.printf("%2d",i);
			if(((i+d)%7==0) || (i==days[month])) {
				System.out.println();
			}
			
			
		
		
		}
}
}
