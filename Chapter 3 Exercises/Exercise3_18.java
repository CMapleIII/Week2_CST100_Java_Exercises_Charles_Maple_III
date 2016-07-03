/** Program: Cost of shipping
* File: Exercise3_18.java
* Summary: Enter the weight of the package 
* and display shipping cost. If the package 
* is over 50 pounds, it will display cannot 
* be shipped.
* Author: Charles Maple III
* Date: July 1, 2016 
**/

import java.util.Scanner;

public class Exercise3_18 {

	private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter weight of package in pounds.");
		
		double weight = input.nextDouble();
		
		double cost = 0;
		
		if (weight > 0 && weight <= 1)
		{
			cost = 3.5;
		}
		else if (weight > 1 && weight <= 3)
		{
			cost = 5.5;
		}
		else if (weight > 3 && weight <= 10)
		{
			cost = 8.5;
		}
		else if (weight > 10 && weight <= 20)
		{
			cost = 10.5;
		}
		
		if (cost == 0)
		{
			System.out.print("The package cannot be shipped.");
			System.exit(0);
		}
		
		System.out.print("The cost of the shipping is " + cost);
	}

}
