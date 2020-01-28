package com.bridgelabz.BasicProgram;

public class Stopwatch {
	private long start;
	
	{
		start=System.currentTimeMillis();
	}
	public double elapsedTime() {
			long now = System.currentTimeMillis();
			return (now - start) / 1000.0;
		}
		

	public static void main(String[] args) {
		
				int n=5;
				Stopwatch timer1=new Stopwatch();
				double sum1=0.0;
				for(int i=1;i<=n;i++)
				{
					sum1=sum1+Math.sqrt(i);
				}
				double time1=timer1.elapsedTime();
				System.out.printf("%e(%2f seconds)\n",sum1,time1);
				Stopwatch timer2=new Stopwatch();
				double sum2=0.0;
				for(int i=1;i<=n;i++)
				{
					sum2+=Math.pow(i, 0.5);
				}
				double time2=timer2.elapsedTime();
				System.out.printf("%e(%2f seconds)\n",sum2,time2);
				}
				
			
			}	


