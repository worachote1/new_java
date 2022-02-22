package LAB_07;

public class CheckingAccount extends Account {
   
	private double limit;

	CheckingAccount() {

    }
    CheckingAccount(double limit) {
    	this.limit = limit;
    }
    public void setLimit(double limit)
    {
    	this.limit = limit;
    }
    public double getLimit()
    {
    	return this.limit;
    }
    
    @Override
    public void withDraw(double amount)
    {
    	double overdraftLimit = -1*(getLimit());
    	if(getBalance()-amount >= overdraftLimit) 
    	{ 
    		setBalance(getBalance()-amount); 
    	} 
    	else 
    	{
    		System.out.println("Can't withdraw");
    	}
    }
    
}
