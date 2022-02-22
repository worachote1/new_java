package LAB_07;

import java.util.ArrayList;
import java.util.Date;

public class NewAccount extends Transactions {
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	private ArrayList<Transactions> t = new ArrayList<Transactions>();
	
	NewAccount() {
		
	}
	NewAccount(String name,int id,double balance)
	{
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	//Mutator Method
		public void setID(int id)
		{
			this.id = id;
		}
		public void setBalance(double balance)
		{
			this.balance = balance;
		}
		public void setAnnualInterestRate(double annualInterestRate)
		{
			this.annualInterestRate = annualInterestRate;
		}
		
		//Acessor Method
		public int getID()
		{
			return id;
		}
		public double getBalance()
		{
			return balance;
		}
		public double getAnnualInterestRate()
		{
			return annualInterestRate;
		}
		public Date getDateCreated()
		{
			return dateCreated;
		}
		public String getName()
		{
			return name;
		}
	    public ArrayList<Transactions> getTransactions() {
	        return this.t;
	    }
		//Other Method
		public double getMonthlyInterestRate() 
		{
			return (annualInterestRate/100)/12;
		}
		public double getMonthlyInterest() 
		{
			return balance*getMonthlyInterestRate();
		}
		
		public void withDraw(double amount)
		{
			balance -= amount;
			//add history to ArraysList
			t.add(new Transactions('W',amount, this.getBalance(),""));
		}
		public void deposit(double amount)
		{
			balance += amount;
			//add history to ArraysList
			t.add(new Transactions('D',amount, this.getBalance(),""));
		}
		
		public void display()
		{
			DISPLAY_TRANSACTIONS(getTransactions());
		}
		
}
