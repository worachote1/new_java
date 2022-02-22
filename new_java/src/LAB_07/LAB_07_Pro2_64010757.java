package LAB_07;

import java.util.ArrayList;

public class LAB_07_Pro2_64010757 {

	public static void main(String[] args) {
		
        NewAccount newAccount = new NewAccount("George", 1122, 1000);
        newAccount.setAnnualInterestRate(1.65);
        newAccount.deposit(30);
        newAccount.deposit(40);
        newAccount.deposit(50);
        newAccount.withDraw(5);
        newAccount.withDraw(4);
        newAccount.withDraw(2);
        
        System.out.println("Name: " + newAccount.getName());
        System.out.println("Account ID: " + newAccount.getID());
        System.out.println("Annual Interest Rate: " + newAccount.getAnnualInterestRate());
        System.out.println("Balance: " + newAccount.getBalance());
       
        newAccount.display();		
		
		
	}

}
