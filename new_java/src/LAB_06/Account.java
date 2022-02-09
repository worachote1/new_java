package LAB_06;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//Default Constructor
	Account()
	{
		id=0;
		balance = 0;
		annualInterestRate=0;
		dateCreated = new Date();
	}
	
	Account(int id,double balance)
	{
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
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
	}
	public void deposit(double amount)
	{
		balance += amount;
	}
}
