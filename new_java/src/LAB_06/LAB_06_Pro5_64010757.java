package LAB_06;

import java.util.Scanner;

public class LAB_06_Pro5_64010757 {

	public static void main(String[] args) {
		
		System.out.println("Filing Status\r\n"
				+ "[0]-Single filer\r\n"
				+ "[1]-Married jointly or qualifying widow(er)\r\n"
				+ "[2]-Married separately\r\n"
				+ "[3]-Head of household");
		
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		int[][] brackets = {
				{8350, 33950, 82250, 171550, 372950}, // Single filer
				{16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
				{8350, 33950, 68525, 104425, 186475}, // Married separately
				{11950, 45500, 117450, 190200, 372950} // Head of household
				};
			
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the filing status: ");
		int status = sc.nextInt();
		System.out.println("Enter the taxable income: ");
		double taxable_income = sc.nextDouble();
		
		Tax t = new Tax(status, brackets, rates, taxable_income);
		System.out.format("Tax is %.2f",t.getTax());
	}

}
