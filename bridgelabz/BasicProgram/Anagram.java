package com.bridgelabz.BasicProgram;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(char[]s1,char[]s2) {
		int n1=s1.length;
		int n2=s1.length;
		if(n1 !=n2) {
			return false;
		}
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<n1;i++) {
			//for(i=0;i<n2;i++) {
				if(s1[i]!=s2[i]) {
					return false;
					
				}
				return true;
			}
		//}
		return false;
		
		
	
		
	}
	public static void main(String args[]) {
		char[]s1= {'s','i','v','a'};
		char[]s2= {'v','i','s','a'};
		if(isAnagram(s1,s2))
			System.out.println("given both strings are equals so it is anagram");
			else {
				System.out.println("given both strings are not equals so it is not anagram");	
			
				
			}
			
		}
	}


