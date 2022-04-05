package LAB_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class LAB_10_Pro4_64010757 {

	public static double sum(ArrayList<Double> a)
	{
		double sum = 0;
		for(int i=0;i<a.size();i++)
		{
			sum += a.get(i);
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\LAB_10\\Salary.txt")));
			
			 ArrayList<Double> assistant_salary = new ArrayList<Double>();
			 ArrayList<Double> associate_salary = new ArrayList<Double>();
			 ArrayList<Double> full_salary = new ArrayList<Double>();
			
			while(reader.readLine() != null)
			{
				//System.out.println(reader.readLine());
				String ss[] = reader.readLine().split(" ");
				//System.out.println(Arrays.toString(ss)); 
				String rank = ss[2];
				Double salaray = Double.parseDouble(ss[3]);
				
				// check rank then add salary to arrayList
				switch (rank) {
				case "assistant":
					assistant_salary.add(salaray);
					break;
				case "associate":
					associate_salary.add(salaray);
					break;
				case "full":
					full_salary.add(salaray);
					break;					
				default:
					break;
				}
				
			}
			
			//display sum and average
			DecimalFormat formatter = new DecimalFormat("#,###.00");
			double all = sum(assistant_salary) + sum(associate_salary) + sum(full_salary);
			
			System.out.println(String.format("Total salary for assistant professor is "+formatter.format(sum(assistant_salary))));
			System.out.println(String.format("Total salary for associate professor is "+formatter.format(sum(associate_salary))));
			System.out.println(String.format("Total salary for full professor is "+formatter.format(sum(full_salary))));
			
			System.out.println(String.format("Total salary for all professor is "+formatter.format(all)));
			
			System.out.println(String.format("Average salary for assistant professor is "+formatter.format(sum(assistant_salary)/assistant_salary.size())));
			System.out.println(String.format("Average salary for associate professor is "+formatter.format(sum(associate_salary)/associate_salary.size())));
			System.out.println(String.format("Average salary for full professor is "+formatter.format(sum(full_salary)/full_salary.size())));
		
			int allSize = assistant_salary.size() + associate_salary.size() + full_salary.size();
			System.out.println(String.format("Average salary for all professor is "+formatter.format(all/allSize)));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
