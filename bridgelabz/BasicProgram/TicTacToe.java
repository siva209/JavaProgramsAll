package com.bridgelabz.BasicProgram;

import java.util.Scanner;

import com.bridgelabz.utility.Util.Util;

public class TicTacToe {
	
	
	
		
		char[][]board=new char[3][3];

			public static void main(String[] args) {
				
				Scanner sc1=new Scanner(System.in);
				String p1,p2;
				System.out.println("Enter a player 1 name ");
				p1=sc1.nextLine();
				System.out.println("Enter a player 2 name");
				p2=sc1.nextLine();
				char p1Marker = 0,p2Marker=0;
				System.out.println(p1Marker+"select Marker (x or 0):");
				p1Marker=sc1.nextLine().charAt(0);
				while(p1Marker!='x' && p2Marker!='x' && p1Marker!='0'&&p2Marker!='0')
				{
					System.out.print("Invalid input,Enter correct Marker symbol:");
					p1Marker=sc1.next().charAt(0);
				}
		if(p1Marker=='x' || p2Marker=='x')
			p2Marker='0';
		else
		{
			p2Marker='x';
		}
		TicTacToe g=new TicTacToe();
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				g.board[i][j]=Character.forDigit(++count, 10);
			}
		}
			  Util.display(g.board);
			char choice;
			for(int i=0;i<4;i++)
			{
				System.out.println(p1+"Turn:");
				choice=sc1.next().charAt(0);
			}
			}

			
		}
			


