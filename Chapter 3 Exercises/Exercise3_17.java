/** Program: Rock, Paper, Scissors
* File: Exercise3_17.java
* Summary: Game of rock paper scissors
* Author: Charles Maple III
* Date: June 30, 2016 
**/

import java.util.Scanner;

public class Exercise3_17 {

	private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		
		System.out.print("Scissors (0), Rock (1), Paper(2): ");
		
		int choice = input.nextInt();
		
		int computer = (int) (Math.random() * 3);
		String strPC = "";
		
		switch (computer)
		{
		case 0: strPC = "Scissors"; break;
		case 1: strPC = "Rock"; break;
		case 2: strPC = "Paper"; break;
		}
		
		String strChoice = "";
		switch (choice)
		{
		case 0: strChoice = "Scissors"; break;
		case 1: strChoice = "Rock"; break;
		case 2: strChoice = "Paper"; break;
		
		default: System.out.print("Invalid Input");
		System.exit(0);
		}
		
		System.out.print("The PC's choice is " + strPC + ". Your choice is " + strChoice);
		
		if (computer == choice)
		{
			System.out.print(". It's a draw!!");
		}
		else if (computer - choice == 1 || computer - choice == -2)
		{
			System.out.print(". The PC won!!" );
		}
			
			else if (computer - choice == -1 || computer - choice == 2)
			{
				System.out.print(". You Won!!");
			}
		}

}
