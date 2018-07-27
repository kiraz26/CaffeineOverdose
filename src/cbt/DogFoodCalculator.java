package cbt;

import java.util.Scanner;

public class DogFoodCalculator {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		
		int wetFoodPerDay=2;
		int veggiesPerDay=2;
		int dryFoodPerDay=1;
		
		
		
		
		System.out.println("How many dogs you have?");
		
		int numberOfDogs=input.nextInt();
		
		System.out.println("How many days for calculation?");
		
		int numberOfDays=input.nextInt();
		
		int totalWetFood=wetFoodPerDay*numberOfDays*numberOfDogs;		
		int totalDryFood=dryFoodPerDay*numberOfDays*numberOfDogs;
		int totalveggies=veggiesPerDay*numberOfDays*numberOfDogs;
		
		System.out.println("Total Wet Food ="+totalWetFood+"oz");
		System.out.println("Total Dry Food ="+totalDryFood+"oz");
		System.out.println("Total Veggies ="+totalveggies+"oz");
	}
	
}
