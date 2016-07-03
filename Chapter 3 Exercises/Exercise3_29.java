/** Program: Geometry: Two circles
* File: Exercise3_29.java
* Summary:  Prompts the user to enter 
* the center coordinates and radii of 
* two circles and determines whether the 
* second circle is inside the first or 
* overlaps with the first.
* Author: Charles Maple III
* Date: July 2, 2016 
**/

import java.util.Scanner;

public class Exercise3_29 
{

	private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter center x and y coordinates, and radius of circle 1: ");
		
		double x1 = input.nextDouble();
		double y1 = input. nextDouble();
		double r1 = input.nextDouble();
		
		System.out.print("Enter center x and y coordinates, and radius of circle 2: ");
		
		double x2 = input.nextDouble();
		double y2 = input. nextDouble();
		double r2 = input.nextDouble();
		
		double d = Math.sqrt(Math.pow(x2 - x1,  2) + Math.pow(y2 -y1, 2));
		
		if (d <= Math.abs(r2 - r1))
		{
			if (r1 > r2)
			{
				System.out.print(" Circle 2 is inside Circle 1.");
			}
			else if (r2 > r1)
			{
				System.out.print(" Circle 1 is inside Circle 2");
			}
			else
			{
				System.out.print(" Circle 2 is the same as Circle 1.");
			}
		}
		else if (d < r2 + r1)
		{
			System.out.print("Circle 2 overlaps Circle 1");
		}
		else if (d >= r2 + r1)
		{
			System.out.print("Circle 2 does not overlap Circle 1");
		}
	}

}
