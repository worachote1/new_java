package LAB_07;

import java.time.LocalDate;
import java.time.Month;

public class Employee extends Person{
	public String office; 
	public double salary;
	public LocalDate dateHired;
	
    public Employee() {
    	this.dateHired = LocalDate.of(1988, Month.FEBRUARY, 1);
    }
	
    @Override
    public String toString() {
        return super.toString()+"Employee{office=" + this.office+ ", salary=" + this.salary + ", dateHired=" + this.dateHired + "} ";
    }
    
    
}
