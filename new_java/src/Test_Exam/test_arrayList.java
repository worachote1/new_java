package Test_Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class test_arrayList {

	public static void main(String[] args) {
		ArrayList<String> fname = new ArrayList<String>();
		ArrayList<String> lname = new ArrayList<String>();
		ArrayList<Integer> age = new ArrayList<Integer>();
		ArrayList<Double> salary = new ArrayList<Double>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter first name : "); fname.add(sc.nextLine()); 
			System.out.println("Enter last name : "); lname.add(sc.nextLine());
			System.out.println("Enter age : "); age.add(sc.nextInt());
			System.out.println("Enter salary : "); salary.add(sc.nextDouble()); 
			
			sc.nextLine();
		}
		
		//display
		for(int i=0;i<3;i++)
		{
			System.out.println(fname.get(i)+" "+lname.get(i)+"age : "+age.get(i)+" salary : "+salary.get(i));
		}
	}

}
