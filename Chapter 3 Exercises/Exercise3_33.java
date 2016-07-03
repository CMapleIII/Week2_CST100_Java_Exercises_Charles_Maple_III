/** Program: Financial: compare costs
* File: Exercise3_33.java
* Summary:  prompts the user to enter 
* the weight and price of the each 
* package and displays the one with 
* the better price.
* Author: Charles Maple III
* Date: July 2, 2016 
**/

import java.util.Scanner;

public class Exercise3_33 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.println("Enter weight and price of package 1: ");
		
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
System.out.println("Enter weight and price of package 2: ");
		
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double r = weight2 / price2 - weight1 / price1;
		
		String s = "";
		
		if (r < 0)
		{
			System.out.println("Both packages have the same price.");
			System.exit(0);
		}
		
		if (r > 0)
		{
			s = "Package 2";
		}
		else
		{
			s = "Package 1";
		}
		
		System.out.println(s + " is a better price.");
	}
}
