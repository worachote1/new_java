package LAB_05;

public class LAB_05_Pro1_64010757 {

	public static void main(String[] args) {
		
		Account Suchatvee = new Account(1122,20000);
		
		Suchatvee.setAnnualInterestRate(4.5);
		
		Suchatvee.withDraw(2500);
		Suchatvee.deposit(3000);

		System.out.println(Suchatvee.getBalance());
		System.out.println(Suchatvee.getMonthlyInterest());
		System.out.println(Suchatvee.getDateCreated());
	}

}
