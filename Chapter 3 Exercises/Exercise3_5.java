/** Program: Find future dates
* File: Exercise3_5.java
* Summary: prompts the user to enter an 
* 	integer for today’s day of the week.Also 
* 	prompt the user to enter the number of 
* 	days after today for a future day and 
* 	display the future day of the week.
* Author: Charles Maple III
* Date: June 30, 2016 
**/

import java.util.Scanner;

public class Exercise3_5 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
			int today = input.nextInt();
		
		System.out.print("Enter number of days past since today: ");
			int past = input.nextInt();
			
			String whatDay = "";
			
			switch(today % 7)
			{
			case 1: whatDay = "Monday"; break;
			case 2: whatDay = "Tuesday"; break;
			case 3: whatDay = "Wednesday"; break;
			case 4: whatDay = "Thursday"; break;
			case 5: whatDay = "Friday"; break;
			case 6: whatDay = "Saturday"; break;
			case 7: whatDay = "Sunday"; break;
			}
			
			System.out.print("Today is " + whatDay + " and the future day is ");
			
			int day = (today + past);
			
			switch(day % 7)
			{
			case 1: whatDay = "Monday"; break;
			case 2: whatDay = "Tuesday"; break;
			case 3: whatDay = "Wednesday"; break;
			case 4: whatDay = "Thursday"; break;
			case 5: whatDay = "Friday"; break;
			case 6: whatDay = "Saturday"; break;
			case 7: whatDay = "Sunday"; break;
			}
			
			System.out.print(whatDay);
	}
}
