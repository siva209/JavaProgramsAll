package com.bridgelabz.utility.Util;

import java.util.Scanner;

public class Util {
	public static String replace(String name, String s12) {
		
	String s1="Hello<<username>>How are you?";
	 String s2=s1.replace("username", "siva");
	 System.out.println(s2);
	return s2; 

}
	public static int primeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			int t = n % i;
			if (t == 0) {
				if (isPrime(i))
					System.out.println(i + " ");
			}
		}
		return n;
	}
	public static double chill(double t, double v) {

		if (t > 50) {
			System.out.println("it is not valid");
		} else {
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			return w;
		}
		if (v > 120 || v < 3) {
			System.out.println("It is not valid");
		} else {
			double w1 = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

			return w1;
		}
		return 0;
	}
	
	
	
	public static int distance(int x, int y) {
		int d = (x * x + y * y);
		int a = (int) Math.pow(d, 0.5);
		System.out.println(a);
		return a;

	}

	public static double quadratic(double a, double b, double c)

	{
		double d = b * b - 4.0 * a * c;
		double root1 = (-b + Math.pow(d, 0.5) / (2.0 * a));
		double root2 = (-b + Math.pow(d, 0.5) / (2.0 * a));

		System.out.println(root2);
		return root1;
	}


	 



private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		return false;
	}
public static boolean isLeap(int year) {
	boolean isleap=false;
	if (year%400==0||(year%4==0&&year%100!=0)){
	return true;
}
	else
	{
	return false;
}
}

public static int Power(int n) 
{ 
   // if (n == 0) 
        //return false; 

    //while (n != 1) { 
       // if (n % 2 != 0) 
          //  return false; 
        //n = n / 2; 
    //} 
    //return true; //

	int i=0;
	int power=1;
	System.out.println("powers of 2 that are less then 2^"+n);
	while(i<=n) {
		System.out.println("2^"+i+"="+power);
		power+=power;
		i++;
		
	}
	return power;
	
} 


public static double nthHarmonic(int N)
{
float harmonic =1;
for (int i=2;i<=N;i++)
{
	harmonic+=(float)1/i;
	
}
return harmonic;
}

public static int factorial(int n) {
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	
	}
	return fact;
}
public static int flip(int flip) {
	int heads=0;
	int tails=0;
	if(Math.random()<0.5) {
		heads++;
		//System.out.println(heads);
	}
	else {
		tails++;
		//System.out.println(tails);
	}
	System.out.println("number of heads="+heads);
	System.out.println("number of tails="+tails);
	int perH=(int)100.0*heads/flip;
	int perT=(int)100.0*heads/flip;
	int totalper=perH-perT;
	System.out.println("percentage of perH="+perH);
	System.out.println("percentage of perT="+perT);
	System.out.println("totalper="+totalper);
	
	return totalper;
	
	}
	
	public static void coupon() {
		char[] chars="213avcAbC".toCharArray();
		int max=10000000;
		int random=(int) (Math.random()*max);
		StringBuffer sb=new StringBuffer();
		while(random>0) {
			sb.append(chars[random % chars.length]);
			random /=chars.length;
			
		}
		String couponCode=sb.toString();
		System.out.println(couponCode);
	
		
		
		
		
	}
	
		Scanner sc=new Scanner(System.in);
	public int inputInteger() {
		
		return sc.nextInt();
	}
	public double inputDouble() {
		
		return sc.nextDouble();
	}

	
	public  String inputString() {
		
		return sc.nextLine();
	}
	public static int gambler(int stake, int goal, int trails) {
		int bets = 0;
		int wins = 0;
		for (int t = 0; t < trails; t++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
			}
			if (Math.random() < 0.5) {
				cash++;
			} else {
				cash--;
			}
			if (cash == goal) {
				wins++;
			}
			System.out.println(wins+"wins of"+trails);
			System.out.println("percentage of games won="+100.0*wins/trails);
			System.out.println("avg of bets="+1.0*bets/trails);
			
		}
		return wins;
	}
	
	
	public static void replace(char board[][], char find, char replace) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == find) {
					board[i][j] = replace;
					return;
				}
			}
		}
	}
	public boolean checkForWin() {
		return(checkForRow()||checkForColumn()||checkForDiagonal());
	}
		public boolean checkForRow() {
			char board[][]=new char[3][3];
			for(int i=0;i<3;i++) {
				if(check(board[i][0],board[i][1],board[i][2])==true) {
					return true;
				}
				return false;
			}
			return false;
		}
			public boolean checkForColumn() {
				char board[][]=new char[3][3];
				for(int j=0;j<3;j++) {
					
					if(check(board[0][j],board[1][j],board[2][j])==true)
						return true;
				}
				return false;
			}

			public boolean checkForDiagonal() {
				char board[][]=new char[3][3];
				return ((check(board[0][0],board[1][1],board[2][2])==true)||(check(board[0][2],board[1][1],board[2][0])==true));
			}
			public boolean check(char c1,char c2,char c3) {
				return (c1==c2)&&(c2==c3);
			}








			public static void display(char[][] board) {
				// TODO Auto-generated method stub
				
			}


			public static void triple(int[] arr, int n) {
				boolean istriple = true;
				for (int i = 0; i < n - 2; i++) {
					for (int j = i + 1; j < n - 1; j++) {
						for (int k = j + 1; k < n; k++) {
							if (arr[i] + arr[j] + arr[k] == 0) {
								System.out.println(arr[i]);
								System.out.println("\n");
								System.out.println(arr[j]);

								System.out.println("\n");
								System.out.println(arr[k]);
								System.out.println("\n");

								istriple = true;
							}

						}
					}

					if (istriple == false) {
						System.out.println("not exist");
					}
					return;

				}
			
			}
			private static final Scanner sc1=new Scanner(System.in);
			 public static int readInteger() {     //Scanner object to input Integer 
				return sc1.nextInt();
				 
			 }
			 public static double readDouble() {    //Scanner object to input double// 
				 return sc1.nextDouble();
			 }
			 public static long readLong() {         //Scanner object to input long//
				 return sc1.nextLong();
				 
			 }
			 public static float readFloat() {      //Scanner object to input float//
				 return sc1.nextFloat();
			 }
			 public static String readString() {    //Scanner object to input String//
				 return sc1.nextLine();
			 }

			





		
				
			}








			
	
	


