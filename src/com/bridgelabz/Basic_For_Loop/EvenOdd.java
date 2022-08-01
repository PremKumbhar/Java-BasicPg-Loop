package com.bridgelabz.Basic_For_Loop;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		int i=0;
		int j=0;
		int sum1=0;
		int sum2=0;
		
		for(i = 1; i <= 20; i++) 
		{
			if(i % 2 == 0 && j % 2 != 0) 
				System.out.println(i+ "\t" +j);
				j++;
				sum1 = sum1+(i);
				sum2 = sum2+(j);
		}
		System.out.println(sum1+ "\t" +sum2);	
	}
}
	