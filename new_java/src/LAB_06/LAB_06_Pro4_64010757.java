package LAB_06;

import java.util.Scanner;

public class LAB_06_Pro4_64010757 {

	public static double tax_calculate(Byte status,double taxable_income ,int brackets[][],double rates[])
	{
		return brackets[status][0] * rates[0] +
				(brackets[status][1] - brackets[status][0]) * rates[1] +
				(brackets[status][2] - brackets[status][1]) * rates[2] +
				(brackets[status][3] - brackets[status][2]) * rates[3] +
				(brackets[status][4] - brackets[status][3]) * rates[4] +
				(taxable_income - brackets[status][4]) * rates[5];
	}
	public static void main(String[] args) {
		
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		int[][] brackets = {
				{8350, 33950, 82250, 171550, 372950}, // Single filer
				{16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
				{8350, 33950, 68525, 104425, 186475}, // Married separately
				{11950, 45500, 117450, 190200, 372950} // Head of household
				};
		
		System.out.println("Filing Status\r\n"
				+ "[0]-Single filer\r\n"
				+ "[1]-Married jointly or qualifying widow(er)\r\n"
				+ "[2]-Married separately\r\n"
				+ "[3]-Head of household");
		
		Scanner sc = new Scanner(System.in);
		byte status; double taxable_income; double tax;
		System.out.println("Enter the filing status: ");
		status = sc.nextByte();
		System.out.println("Enter the taxable income: ");
		taxable_income = sc.nextDouble();
		
		tax = tax_calculate(status, taxable_income, brackets, rates);
		System.out.format("Tax is %.2f",tax);
	}

}
