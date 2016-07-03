/** Program: Palindrome number
* File: Exercise3_12.java
* Summary: A program that prompts the user 
* 	to enter a three-digit integer and 
* 	determines whether it is a palindrome number.
* Author: Charles Maple III
* Date: June 30, 2016 
**/

import java.util.Scanner;

public class Exercise3_12 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter a three digit number");
		
		int number = input.nextInt();
		
		int first = number / 100;
		
		int last = number % 10;
		
		if(last == first)
		{
			System.out.print(number + " is a palindrome.");
		}
		else
		{
			System.out.print(number + " is not a palindrome.");
		}
		
	}
}
