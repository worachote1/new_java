package LAB_10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class LAB_10_Pro3_64010757 {
	
	public static String getRank(String arr_rank[])
	{
		return arr_rank[new Random().nextInt(arr_rank.length)];
	}
	
	public static double getSalary(String rank)
	{
		Random rd = new Random();
		switch (rank) {
		case "assistant":
			return SalaryRate.ASSISTANT_MIN + rd.nextDouble() * (SalaryRate.ASSISTANT_MAX-SalaryRate.ASSISTANT_MIN)+1;
		case "associate":
			return SalaryRate.ASSOCIATE_MIN + rd.nextDouble() * (SalaryRate.ASSOCIATE_MAX-SalaryRate.ASSOCIATE_MIN)+1;
			
		case "full":
			return SalaryRate.FULL_MIN + rd.nextDouble() * (SalaryRate.FULL_MAX-SalaryRate.FULL_MIN)+1;
		default:
			return -1;
		}
	}
	public static void main(String[] args) {
		
		String arr_rank[]= {"assistant","associate","full"};
		String rank;
		double salary;
/*		
		for(int i=0;i<10;i++)
		{
			rank = getRank(arr_rank);
			salary = getSalary(rank);
			System.out.print(String.format("FirstName%d LastName%d ",(i+1),(i+1)));
			System.out.print(rank);
			System.out.println(String.format("  %.2f",salary));
		}
*/	
		try { 
			FileWriter fw = new FileWriter(new File("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\LAB_10\\Salary.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i=0;i<1000;i++)
			{
				rank = getRank(arr_rank);
				salary = getSalary(rank);
				bw.write( String.format("FirstName%d LastName%d ",(i+1),(i+1)));
				bw.write(rank);
				bw.write(String.format(" %.2f\n",salary));
			}
			
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
