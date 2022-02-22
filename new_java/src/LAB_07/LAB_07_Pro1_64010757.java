package LAB_07;

import java.util.Scanner;

public class LAB_07_Pro1_64010757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Checking Account");
        
		System.out.print("Overdraft limit: ");
        double limit = sc.nextDouble();
        
        CheckingAccount CheckingAccount = new CheckingAccount(limit);
        CheckingAccount.setBalance(5000);
        System.out.println("Balance is "+CheckingAccount.getBalance());
        System.out.print("Withdraw:  ");
        double amount = sc.nextDouble();
        CheckingAccount.withDraw(amount);
        
        System.out.println("Balance is "+CheckingAccount.getBalance());
        //invoke toString
        System.out.println(CheckingAccount);
	}
	

}
