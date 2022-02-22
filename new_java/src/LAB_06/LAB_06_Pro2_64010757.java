package LAB_06;
import java.io.*;
import java.nio.file.FileSystemLoopException;
import java.util.*;


public class LAB_06_Pro2_64010757 {
	public static void displayStudent(Course c,int NumberOfStudents)
	{
		int i = NumberOfStudents;
		if(c.getNumberOfStudents()-i < c.getNumberOfStudents())
		{
			System.out.println(c.getStudents()[c.getNumberOfStudents()-i]);
			i--;
			displayStudent(c, i);
		}
		return;
	}
	public static void main(String[] args) {
		
		Course OOP = new Course("object Oriented Programming Sec119");
		
		OOP.addStudent("A"); OOP.addStudent("B"); OOP.addStudent("C");
		//OOP.dropStudent("B");
	//OOP.clear(OOP.getNumberOfStudents()); //test
		displayStudent(OOP, OOP.getNumberOfStudents());
	}
}
