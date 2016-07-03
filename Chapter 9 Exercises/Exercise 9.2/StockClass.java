/** Program: Stock
* File: StockClass.java
* Summary: 
* Author: Charles Maple III
* Date: June 30, 2016 
**/

public class StockClass 
{
	//VARIABLES
	public String symbol;
	public String stockName;
	public double previousClosingPrice = 34.5;
	public double pcPercentage;//Price Change Percentage
	public double currentPrice = 34.35;
	
	
	//CONSTRUCTOR
	StockClass(String symbol, String stockName)
	{
		symbol = "ORCL";
		stockName = "Oracle Corporation";
		
	}
	
	//getPreviousPrice Method
		public double getPreviousPrice()
		{
			System.out.println("Previous Price is: " + previousClosingPrice);
			return previousClosingPrice;
		}	
		
	//getCurrentPrice Method	
		public double getCurrentPrice()
		{
			System.out.println("The current price is: " + currentPrice);
			return currentPrice;
		}
	
	//getChangePercent Method
	public double getChangePercent()
	{
		pcPercentage = (((previousClosingPrice - currentPrice) / previousClosingPrice) * 100);
		
		System.out.print("The Price Change Percentage is: " + pcPercentage);
		return pcPercentage;
		
	}
	
}
