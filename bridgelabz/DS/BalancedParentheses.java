package com.bridgelabz.datastructures;

public class BalancedParentheses  extends Stack{
	static boolean isBalanced(char[]s) {
	Stack st=new Stack();
	for(int i=0;i<s.length;i++) {
		if(s[i]=='(') {
			st.push(s[i]);
			if(s[i]==')') {
				st.pop();
			}
		}
	}
	
		return false;
		
	}
	public static void main(String args[]) {
		char []s= {'(','(',')'};
		if(isBalanced(s)) {
			System.out.println("is balanced");
		}
		else {
			System.out.println("is not balanced");
		}
			
	}
	

}
