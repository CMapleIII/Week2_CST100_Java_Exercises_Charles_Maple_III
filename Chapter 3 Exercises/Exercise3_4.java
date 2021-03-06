/** Program: Random Month
* File: Exercise3_4.java
* Summary: randomly generates an integer between 1 and 12 and displays the month name
* Author: Charles Maple III
* Date: June 30, 2016 
**/

public class Exercise3_4 
{
	public static void main(String[] args)
	{
		int number1 = (int) (System.currentTimeMillis() % 12 + 1);
		
		String month = "";
		
		switch(number1)
		{
		case 1: month = "January"; break;
		case 2: month = "February"; break;
		case 3: month = "March"; break;
		case 4: month = "April"; break;
		case 5: month = "May"; break;
		case 6: month = "June"; break;
		case 7: month = "July"; break;
		case 8: month = "August"; break;
		case 9: month = "September"; break;
		case 10: month = "October"; break;
		case 11: month = "November"; break;
		case 12: month = "December"; break;
		}
		
		System.out.print(month);
	}
}
