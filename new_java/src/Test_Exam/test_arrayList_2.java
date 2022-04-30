package Test_Exam;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test_arrayList_2 {

	public static void main(String[] args) throws IOException {
	
		dataManager data = new dataManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Before set all data : ");
		data.displayAllData();
		
		for(int i=0;i<3;i++)
		{
				System.out.println("Enter first name : "); data.setFname(sc.nextLine()); 
				System.out.println("Enter last name : "); data.setLname(sc.nextLine());
				System.out.println("Enter age : "); data.setAge(sc.nextInt());
				System.out.println("Enter salary : "); data.setSalary(sc.nextLong());
				
				sc.nextLine();				
		}
			
		System.out.println("After set all data : ");
		data.displayAllData();
		
		System.out.println("Test update data : ");
		//Update data No.2
		data.reviseData(2);
		data.displayAllData();
		
		//Save to file
		System.out.println("Save to file................");
		data.saveData();
	}

}
