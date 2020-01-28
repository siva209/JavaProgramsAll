package com.bridgelabz.BasicProgram;

import com.bridgelabz.utility.Util.Util;

public class Replace {
String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

public static void main(String[] args) {
		String s1="Hello<<username>>How are you?";
	String str=Util.replace("siva", s1);
	}

	
	


}
