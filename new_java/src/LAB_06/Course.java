package LAB_06;

public class Course {
	private String courseName;
	private int numberOfStudents;
	private final int SIZE_DEFAULT = 100;
	private String[] students = new String[SIZE_DEFAULT];
	
	//temp array will be use when addStudent() 
	//but numberOfStudents exceed SIZE_DEFAULT 
	private String[] temp; 
	
	public Course(String courseName) 
	{
		this.courseName= courseName;
		numberOfStudents = 0;
	}
  
	public String[] getStudents()
	{
		return students;
	}	
 
	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}	
 
	public String getCourseName()
	{
		return courseName;
	}
 
	//
	public void addStudent(String student)
	{
		//when member exceed SIZE_DEFAULT
		if(numberOfStudents >= SIZE_DEFAULT)
		{
			temp = new String[this.students.length+1];
			System.arraycopy(student, 0, temp, 0, this.students.length);
		}
		
		this.students[numberOfStudents++] = student;
	}
	public void dropStudent(String student) 
	{
        for (int i = 0; i < students.length; i++) 
        {
            if (this.students[i].equals(student)) 
            {
            	//shift the dropped student to the last member index
            	for(int j=i;j<=(numberOfStudents-1)-1;j++)
            	{
            		String temp = this.students[j];
            		this.students[j] = this.students[j+1];
            		this.students[j+1] = temp;
            	}
            	break;
            }
        }
        //remove last member which now is the dropped student
        this.students[(numberOfStudents-1)] = null;
        numberOfStudents--;
	}
	public void clear(int numberOfStudents)
	{
		int a = numberOfStudents;
		if(this.numberOfStudents-a < this.numberOfStudents)
		{
			students[this.numberOfStudents-a] = null;
			a--;
			clear(a);
		}
		return;
	}
 
}
