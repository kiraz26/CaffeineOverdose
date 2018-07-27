package cbt;

import java.util.Scanner;

public class CaffeineOverdose {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of milligrams in drink:");
		
		double drink=input.nextDouble();
		double lethal=10000/drink;
		
		
		System.out.println("It would take about "+lethal+" drinks for a lethal overdose.");
		
	}

}
