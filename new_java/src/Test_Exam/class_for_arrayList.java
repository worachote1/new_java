package Test_Exam;

import java.util.ArrayList;

public class class_for_arrayList {

	private ArrayList<String> fname;
	private ArrayList<String> lname;
	private ArrayList<Integer> age;
	private ArrayList<Long> salary;
	
	public class_for_arrayList() 
	{
		this.fname = new ArrayList<String>();
		this.lname = new ArrayList<String>();
		this.age = new ArrayList<Integer>();
		this.salary = new ArrayList<Long>();
	}
	
	//Set Method
	public void setFname(String fname) 
	{
		this.fname.add(fname); 
	}
	public void setLname(String lname) 
	{
		this.lname.add(lname);
	}
	public void setAge(int age) 
	{
		this.age.add(age);
	}
	public void setSalary(Long salary) 
	{
		this.salary.add(salary);
	}
	
	//get Method
	//get data by index
	public String getFname(int index)
	{
		return fname.get(index);
	}
	public String getLname(int index)
	{
		return lname.get(index);
	}	
	public int getAge(int index) 
	{
		return age.get(index);
	}
	public double getSalary(int index)
	{
		return salary.get(index);
	}
	//get all data ArrayList
	public ArrayList<String> getFname()
	{
		return fname;
	}
	public ArrayList<String> getLname()
	{
		return lname;
	}	
	public ArrayList<Integer> getAge() 
	{
		return age;
	}
	public ArrayList<Long> getSalary()
	{
		return salary;
	}	
	
	//Display all data
	public void displayAllData()
	{
		System.out.println("\t----Display All Data----");
		for(int i=0;i<fname.size();i++)
		{
			System.out.println("No."+(i+1));
			System.out.println("Name : "+getFname(i)+" "+getLname(i));
			System.out.println("Age : "+getAge(i)); 
			System.out.println("Enter salary : "+getSalary(i)); 
			
			if(i != fname.size()-1) 
				System.out.println("----------------------------------------------------------------");
		}
	}
	
	//Display data by index
	public void displayData(int index)
	{
		System.out.println("\t----Display Data----");
		System.out.println("No."+(index+1));
		System.out.println("Name : "+getFname(index)+" "+getLname(index));
		System.out.println("Age : "+getAge(index)); 
		System.out.println("Enter salary : "+getSalary(index));
		System.out.println("----------------------------------------------------------------");
	}
	
	
}
