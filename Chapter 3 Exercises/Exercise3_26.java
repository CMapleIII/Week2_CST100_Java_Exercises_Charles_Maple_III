/** Program: Is divisible by
* File: Exercise3_26.java
* Summary: a program that prompts 
* the user to enter an integer and 
* determines whether it is divisible 
* by 5 and 6, whether it is divisible 
* by 5 or 6, and whether it is 
* divisible by 5 or 6, but not both.
* Author: Charles Maple III
* Date: July 1, 2016 
**/

import java.util.Scanner;

public class Exercise3_26 {

	private static Scanner input;
	private static boolean divisBy5;
	private static boolean divisBy6;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		
		int number = input.nextInt();
		
		divisBy5 = false;
		divisBy6 = false;
		
		if (number % 5 == 0)
		{
			divisBy5 = true;
		}
		
		if (number % 6 == 0)
		{
			divisBy6 = true;
		}
		
		System.out.println("Is " + number + " divisible by 5 and 6? " + (divisBy5 && divisBy6));
		System.out.println("Is " + number + " divisible by 5 or 6? " + (divisBy5 || divisBy6));
		System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (divisBy5 ^ divisBy6));
	}

}
