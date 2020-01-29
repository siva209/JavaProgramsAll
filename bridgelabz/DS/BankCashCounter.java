package com.bridgelabz.DS;

import com.bridgelabz.utility.Util.Util;
import com.bridgelabz.utility.Util.Util1;

public class BankCashCounter {
	public static void main(String args[]) {
		Queue<String> q = new Queue<String>();
		long balance = 1000;
		System.out.println("enter no of users");
		int users = Util1.readInteger();
		String s = "";
		int cash, withdraw, depositbalance;
		for (int i = 1; i <= users; i++) {
			System.out.println("enter user");
			s = Util1.readString();
			q.enqueue(s);
			System.out.println("1.withdraw 2.deposit");
			cash = Util.readInteger();
			switch (cash) {
			case 1:
				System.out.println("enter withdraw amount");
				withdraw = Util.readInteger();
				q.dequeue();
				break;

			case 2:
				System.out.println("enter deposit amount");
				depositbalance = Util.readInteger();
				balance = balance + depositbalance;
				q.dequeue();
				break;
			default:
				System.out.println("correct option");
			}
		}
		System.out.println("balance" + balance);

	}
}
