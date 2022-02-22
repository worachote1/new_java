package LAB_07;

public class SavingAccount extends Account {
    SavingAccount() 
    {
		
	}
    @Override
    public void withDraw(double amount) {
    	if(getBalance()-amount >= 0)
    	{
    		setBalance(getBalance()-amount);
    	}
    	else
    	{
    		System.out.println("Can't withdraw");
    	}
    }
    
}
