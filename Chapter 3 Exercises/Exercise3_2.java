/** Program: Add Three Numbers
* File: Exercise3_2.java
* Summary: Adds three numbers.
* Author: Charles Maple III
* Date: June 29, 2016 
**/
import java.util.Scanner;

public class Exercise3_2 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		//Randomly generate three single digit numbers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 7 % 10);
		int number3 = (int) (Math.random() * 13 % 10);
		
		input = new Scanner(System.in);		//Create the Scanner
		
		System.out.print(("What is ") + number1 + " + " + number2 + " + " + number3 + "?");	//Print the question
		
		int answer = input.nextInt(); 	//input the answer
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + 
		answer + " is " + (number1 + number2 + number3 == answer));	//print out the question followed by the answer and if it is true or false.
		
	}
}
