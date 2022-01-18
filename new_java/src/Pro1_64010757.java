
public class Pro1_64010757 {

	public static void calPop(int y) {
		int pop = 312032486;
		int oneDay = 86400;
		int oneYear = 365 * oneDay;

		// to add
		double birth = (oneYear * y) / 7.0; 
	//	System.out.println("birth  : "+birth);
		double imm = (oneYear * y) / 45.0;
	//	System.out.println("immi : "+imm);
		// to subtract
		double death = (oneYear * y) / 13.0;
	//	System.out.println("death : "+death);
		
	//	System.out.println("(birth+imm)-death = "+(birth+imm-death));
		
		double cal = (birth+imm-death);
		double result = pop+cal;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// Write a program to display the population for each of the next five years.
		// Assume the current population is 312,032,486 and one year has 365 days.

		// One birth every 7 seconds
		// One death every 13 seconds
		// One new immigrant every 45 seconds
		for(int i=1;i<=5;i++)
		{
			calPop(i);
		}
	}

}
