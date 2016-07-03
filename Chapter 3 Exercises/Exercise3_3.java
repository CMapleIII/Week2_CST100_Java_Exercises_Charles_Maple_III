/** Program: Solve 2 x 2 linear equations
* File: Exercise3_3.java
* Summary: prompts user to enter a, b, c, d, e, and f to display results.
* Author: Charles Maple III
* Date: June 29, 2016 
**/

import java.util.Scanner;

public class Exercise3_3 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		
	input = new Scanner(System.in);
	
	System.out.print("Enter a, b, c, d, e, f:");
	
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double d = input.nextDouble();
	double e = input.nextDouble();
	double f = input.nextDouble();
	
	if (a * d - b * c == 0)
		{
			System.out.println("The equasion has no solution.");
			System.exit(0);
		}
	
	double x = (e * d - b * f) / (a * d - b * c);
	double y = (a * f - e * c) / (a * d - b * c);
	
	System.out.print("x is " + x);
	System.out.println(" and y is " + y);
	}
}
