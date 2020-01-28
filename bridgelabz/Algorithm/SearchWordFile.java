package com.bridgelabz.Algorithm;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.utilAlgorithm.UtilAlgorithm;


public class SearchWordFile {

	public  String[] fileRead(File f) throws IOException {
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fr = new FileReader(f);
		int c;
		while ((c = fr.read()) != -1) {
			if (c == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		fr.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}

	/**
	 * Main function to test the class
	 * 
	 * @param args
	 * @throws Exception if input is not correct
	 */
	public void main(String[] args) throws Exception {
		File f = new File("/home/java.txt");
		try {
			Scanner s = new Scanner(System.in);
			String arr[] = fileRead(f);
			for (String string : arr) {
				System.out.println(string);
			}
			System.out.println("enter name to search");
			String s1 = s.nextLine();
			
			int i = UtilAlgorithm.binary(arr, s1);
			if (i < 0)
				System.out.println("not found");
			else
				System.out.println("found");
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}


}
	


