package com.bridgelabz.utilAlgorithm;


	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Calendar;
	import java.util.GregorianCalendar;
	import java.util.Scanner;

	public class UtilAlgorithm {
		
		public static boolean anagramcheck(String s1 ,String s2) {
			 char [] ca1=s1.toCharArray();
			 char [] ca2=s2.toCharArray();
			 Arrays.sort(ca1);
			 Arrays.sort(ca2);
			 return Arrays.equals(ca1,ca2);
		}   
		public static void prime() {
			System.out.println();
			boolean b;
			for (int j = 2; j <= 1000; j++) {
				b = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						b = false;
						break;
					}
				}
				if (b)
					System.out.print(j + " ");
			}
		}

		/**
		 * function to check if given no is prime or not
		 * 
		 * @param n the number which to check for prime
		 * @return true if prime false if not
		 */
		public static boolean isPrime(int n) {
			for (int i = 2; i < n / 2; i++) {
				if (i % n == 0) {
					return false;
				}
			}
			return true;
		}
		/**function to check the given number is palindrome or not
		 * @param b and j check the number is palindrome or not
		 * 
		 */
		public static void primePallindrome() {
			System.out.println();
			boolean b;
			for (int j = 2; j <= 1000; j++) {
				b = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						b = false;
						break;
					}
				}
				if (b && isPallindrome(j))
					System.out.print(j + " ");
			}
		}
		public static boolean isPallindrome(int n) {
			int temp = n;
			int sum = 0;
			while (temp != 0) {
				int r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			if (sum == n) {
				return true;
			}
			return false;
		}
	/** function to check the given number is anagram or not
	 * @param anagram function check number is anagram or not
	 * 
	 */
		public static void primeAnagrams() {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			System.out.println();
			boolean b;
			for (int j = 2; j <= 1000; j++) {
				b = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						b = false;
						break;
					}
				}
				if (b)
					ar.add(j);
			}
			for (int i = 0; i < ar.size(); i++) {
				for (int j = i + 1; j < ar.size(); j++) {
					if (anagram(ar.get(i), ar.get(j))) {
						System.out.println(ar.get(i) + "  " + ar.get(j));
					}
				}
			}
		}

		
		
		public static boolean anagram(int n1, int n2) {
			int[] n1count = count(n1);
			int[] n2count = count(n2);
			for (int i = 0; i < n2count.length; i++) {
				if (n1count[i] != n2count[i]) {
					return false;
				}
			}
			return true;
		}
		public static int[] count(int n) {
			int[] count = new int[10];
			int temp = n;
			while (temp != 0) {
				int r = temp % 10;
				count[r]++;
				temp = temp / 10;
			}
			return count;
		}

		public static void sortarray(int[] arr) {
			      int n = arr.length;
			      int temp = 0;

			      for(int i = 0; i < n; i++) {
			         for(int j=1; j < (n-i); j++) {
			            if(arr[j-1] > arr[j]) {
			               temp = arr[j-1];
			               arr[j-1] = arr[j];
			               arr[j] = temp;
			            }
			         }
			      }
			   }
		
		
			
		public static int method(int year, int month, int day) 
		    { 
		        // to check the validity of day of month 
		        int[] darr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		  
		        // check validity of year and month 
		        if ( year> 0 && (month > 0 && month <= 12)) { 
		  
		            // check for a leap year and month of February 
		  
		            if (( year% 4 == 0 || year % 400 == 0) &&  
		                month == 2 && (day > 0 && day <= 29)) { 
		  
		                // month starts at zero, so we need to put ( month - 1 ). 
		                Calendar calendar = new GregorianCalendar(year, month - 1, day); 
		                return calendar.get(Calendar.DAY_OF_WEEK); 
		            } 
		            else { 
		  
		                // check the range of day of month 
		                if (month > 0 && month <= darr[month - 1]) { 
		  
		                    // month starts at zero, so we need to put ( month - 1 ). 
		                    Calendar calendar = new GregorianCalendar(year, month - 1, day); 
		                    return calendar.get(Calendar.DAY_OF_WEEK); 
		                } 
		                else
		                    return 0; 
		            } 
		        } 
		        else
		            return 0; 
			}


		public static String[] sort_sub(String array[], int f){
			String temp="";
			for(int i=0;i<f;i++){
			for(int j=i+1;j<f;j++){
			if(array[i].compareToIgnoreCase(array[j])>0){
			temp = array[i];
			array[i]=array[j];
			array[j]=temp;
			}
			}
			}
			return array;
			}

			public static double temperatureconversion(double c,double f) {
				 c=((f-32.0)*5)/9.0;
				 
				 f=((c*9.0)/5)+32.0;
				 return c;
			}
			public static double issqrt(double c) {
				double t=c;
				double epsilon=1.0e-15;
				while((Math.abs(t-c/t)>epsilon*t)) {
					t=(c/t+t)/2.0;
				}
				return t;
				}
			public static void toBinary1(int decimal) {
			     int binary[] = new int[40];    
			     int index = 0;    
			     while(decimal > 0){    
			       binary[index++] = decimal%2;    
			       decimal = decimal/2;    
			     }    
			     for(int i = index-1;i >= 0;i--){    
			       System.out.print(binary[i]);    
			     }
				
			  
			
			}
			public static void merge(int[]arr,int l,int r) {
				int m=(l+r)/2;
				System.out.println(m);
				int n1=m-l;
				System.out.println(n1);
				int n2=r-m;
				System.out.println(n2);
				int[] L=new int[n1];
				int[] R=new int[n2];
				for(int i=0;i<=n1;i++) 
					L[i]=arr[l+i];
					for(int j=0;j<=n2;j++) 
						R[j]=arr[l+1-m];
					int i=0,j=0;
					int k = l; 
			        while (i < n1 && j < n2) 
			        { 
			            if (L[i] <= R[j]) 
			            { 
			                arr[k] = L[i]; 
			                i++; 
			            } 
			            else
			            { 
			                arr[k] = R[j]; 
			                j++; 
			            } 
			            k++; 
			        } 
			        while(i<n1) {
			        	arr[k]=L[i];
			        	i++;
			        	k++;
			        }
			        while(i<n2) {
			        	arr[k]=R[i];
			        	j++;
			        	k++;
					}
					
				}
			public static void sort(int[]arr,int l,int r) {
				if(l<r) {
					int m=l+r/2;
					sort(arr,l,m);
					sort(arr,m+1,r);
					merge(arr,l,r);
					
				}
				
			}
			public static void printArray(int[]arr) {
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
					System.out.println();
				}
			}
			/**
			 * to calculate monthly payment for r interest and p principal for y years
			 *
			 * @param p the principal amount given
			 * @param y the year for which p is given
			 * @param r the rate at which p is given
			 * @return monthly payment
			 */
			public static double monthlyPayment(double p, double y, double r) {
				double n = 12 * y;
				double r0 = r / (12 * 100);
				double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
				return payment;
			

			}
			
				Scanner sc=new Scanner(System.in);
			public int inputInteger() {
				return sc.nextInt();
			}

			public double inputDouble() {
				
				return sc.nextDouble();
			}

			public String inputString() {
				// TODO Auto-generated method stub
				return sc.nextLine();
			}
			/**
			 * Function to convert decimal to binary
			 *
			 * @param d integer value to convert
			 * @return return integer array with binary digits
			 */
			public static int[] toBinary(int d) {

				String bin = "";
				while (d != 0) {
					bin = (d % 2) + bin;
					d /= 2;
				}
				while (bin.length() % 4 != 0) {
					bin = 0 + bin;
				}
				return stringToIntArray(bin);
			}
			/**
			 * Function to convert string to int array helper function for swapnibble in
			 * Binary.java class
			 *
			 * @param bin String of binary no
			 * @return return integer array
			 */
			static int[] stringToIntArray(String bin) {
				int[] binary = new int[bin.length()];
				for (int i = 0; i < binary.length; i++) {
					binary[i] = bin.charAt(i) - 48;
				}
				return binary;
			}

			/**
			 * Function to convert binary to decimal
			 * @param binary 
			 *
			 * @param [] the binary array to cenvert
			 * @return return converted decimal no
			 */
			public static int toDecimal(int[] binary) {
				int dec = 0, j = 0;
		
				for (int i =binary.length-1 ; i >= 0; i--) {
					if (binary[i] == 1) {
						dec = dec + (int) Math.pow(2, j);
					}
					j++;
				}
				return dec;
			}
			public static int binary(String[] arr, String s) {
				int high=arr.length-1;
				int lo=0;
				int mid;
				return 0;
			
				
				}
	}
			



			
							
			
				
			
		
		
		
		
		





