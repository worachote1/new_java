package LAB_07;

import java.util.ArrayList;
import java.util.Date;

public class Transactions {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description = "";
	
	Transactions() 
	{
		
	}
	Transactions(char type,double amount,double balance,String description)
	{
		this.date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	protected final void DISPLAY_TRANSACTIONS(ArrayList<Transactions> t)
	{
		System.out.println("Date\t\t\t\tType\tAmount\tBalance");
		for(int i=0;i<t.size();i++)
		{
			System.out.println(t.get(i).date + "\t" + t.get(i).type + "\t" + t.get(i).amount + "\t" + t.get(i).balance);
		}
	}
}
