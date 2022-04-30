package Test_Exam;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dataManager extends class_for_arrayList
	{
		Scanner sc = new Scanner(System.in);
		
		public dataManager() 
		{
			
		}
		
		public void reviseData(int dataNumber)
		{
			int index = dataNumber-1;
			//display old data
			System.out.println("\t----Old Data----");
			displayData(index);
			
			//revise
			System.out.println("No."+dataNumber);
			
			System.out.println("Revise first name : ");  getFname().set(index, sc.nextLine()); 
			System.out.println("Revise last name : "); getLname().set(index,sc.nextLine());
			System.out.println("Revise age : "); getAge().set(index, sc.nextInt());
			System.out.println("Revise salary : "); getSalary().set(index, sc.nextLong());
			
			//update suceed
			System.out.println("\t----Done with update data----");
					
		}
		
		//Save data (write to text file)
		public void saveData() throws IOException
		{
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\Test_Exam\\test_Data.txt"));
			
				for(int i=0;i<getFname().size();i++)
				{
					bw.write(getFname(i)+" "+getLname(i)+" "+getAge(i)+" "+getSalary(i)+"\n");
				}
				
				bw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
