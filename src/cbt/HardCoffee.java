package cbt;

import java.util.Scanner;

public class HardCoffee {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Did you drink coffee or cola?");
		String coffeee=input.nextLine();
		String colaa=input.nextLine();
		boolean coffee=true;
		boolean cola=false;
		
		if (coffee) {
			System.out.println("Enter milligrams of coffee:");
		} else if (cola) {
			System.out.println("Enter milligarams of cola:");
		}
		double drink=input.nextDouble();
		double lethal=10000/drink;
		double cof=100;
		double col=340/12;
		

		
		System.out.println("It would take about "+lethal+" drinks for a lethal overdose.");
	
	}

}