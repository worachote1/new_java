package LAB_04;

public class Lab04_Pro1_64010757 {

	public static void main(String[] args) {
		
		Stock ORCL = new Stock("ORCL","Oracle Corporation");
		ORCL.currentPrice = 34.35;
		
		System.out.println("Symbol: "+ORCL.symbol);
		System.out.println("Name: "+ORCL.name);
		System.out.println("Previous Closing Price: "+ORCL.previousClosingPrice);
		System.out.println("Current Price: "+ORCL.currentPrice);
		System.out.println("Price Change: "+ORCL.getChangePercent()+"%");
	}

}
