package LAB_07;

public class Student extends Person{
	
	//enum is a data type that stores a list of constants. 
	public enum status { FRESHMAN, SOPHOMORE, JUNIOR, SENIOR };
	
	public String studentStatus; 
	Student()
	{
		this.studentStatus = "FRESHMAN";
	}
    @Override
    public String toString() {
        return super.toString() + "Student{status="+status.valueOf(studentStatus)+"}"; //this.studentStatus
    }
    
    
}
