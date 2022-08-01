package com.bridgelabz.Basic_For_Loop;

import java.util.Scanner;

public class exampleOfAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number");
		int a=sc.nextInt();
		
		System.out.println("Enter end number");
		int b=sc.nextInt();
		
		for(int i = a; i <= b; i++) 
		{
			System.out.println(+i);
		}
			

	}

}
