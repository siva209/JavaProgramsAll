package com.bridgelabz.BasicProgram;
public class Gambler {
	private int stake;
	private int goal;
	private int trails;
	public int getStake() {
		return stake;
	}
	public void setStake(int stake) {
		this.stake = stake;
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public int getTrails() {
		return trails;
	}
	public void setTrails(int trails) {
		this.trails = trails;
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
	
	public static void main(String[] args) {
		int s=gambler(5, 3, 4);
		System.out.println(s);
		
		
	}

}