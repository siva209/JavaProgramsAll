package com.bridgelabz.BasicProgram;

import com.bridgelabz.utility.Util.Util;

public class Quadratic {
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	private double a;
	private double b;
	private double c;

	public static void main(String[] args) {
		Util.quadratic(1.0,2.0,3.0);
		
	}

}


