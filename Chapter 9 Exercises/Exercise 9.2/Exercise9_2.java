/** Program: Stock
* File: Exercise9_2.java
* Summary: 
* Author: Charles Maple III
* Date: June 30, 2016 
**/

public class Exercise9_2 
{
	public static void main(String[] args)
	{
		String symbol = "ORCL";
		String stockName = "Oracle Corporation";
		
		//OBJECT
		StockClass SC = new StockClass(symbol, stockName);
		
		//CALLING METHOD
		System.out.println(symbol);
		System.out.println(stockName);
		SC.getPreviousPrice();
		SC.getCurrentPrice();
		SC.getChangePercent();
	}
}
