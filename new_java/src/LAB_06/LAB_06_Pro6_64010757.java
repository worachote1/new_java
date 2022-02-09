package LAB_06;

import java.util.Scanner;

public class LAB_06_Pro6_64010757 {
	
	public static final void MENU(Account p)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Main menu\r\n"
				+ "1: check balance\r\n"
				+ "2: withdraw\r\n"
				+ "3: deposit\r\n"
				+ "4: exit");
		while(true)
		{
			System.out.println("Enter a choice: ");
			byte choice = sc.nextByte();
			if(choice == 1)
			{
				System.out.println("The balance is "+p.getBalance());
			}
			else if(choice == 2)
			{
				System.out.println("Enter an amount to withdraw: ");
				p.withDraw(sc.nextDouble());
			}
			else if(choice == 3)
			{
				System.out.println("Enter an amount to deposit: ");
				p.deposit(sc.nextDouble());
			}
			else
			{
				//Once input 4 then exit loop
				break;
			}
		}
	}
	public static final byte LOG_IN_ID()
	{
		Scanner sc = new Scanner(System.in);
		byte userID;
		//If the id is entered incorrectly, ask the user to enter a correct id.
		while(true)
		{
			System.out.println("Enter an id: ");
			userID = sc.nextByte();
			if(userID<=9 && userID>=0)
			{
				break;
			}
		}
		return userID;
	}
	public static final void ATM()
	{
		//Create ten accounts in an array
		Account p[];
		p = new Account[10];
		for(int i=0;i<=9;i++)
		{
			p[i] = new Account(i,100);
		}
		
		//once the system starts, it will not stop.
		while(true)
		{
			int userID = LOG_IN_ID();
			MENU(p[userID]);
		}
	}
	
	public static void main(String[] args) {
		//Use ATM
		ATM();
	}
}
