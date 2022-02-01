package LAB_04;

public class Stock {
	public String symbol;
	public String name;
	public final double previousClosingPrice = 34.5;
	public double currentPrice;
	
	//Default Constructor
	public Stock()
	{
		
	}
	
	//Constructor
	public Stock(String symbol , String name)
	{
		this.symbol = symbol;
		this.name = name;
	}
	
	public final double getChangePercent()
	{
		double changePrice = currentPrice-previousClosingPrice;
		return changePrice*100/currentPrice;
	}
}
