package LAB_06;

import java.util.Scanner;

public class LAB_06_Pro1_64010757 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String name; int age; double weight,feet,inches;
		System.out.println("Name : "); name = sc.nextLine().trim();
		System.out.println("Age : "); age = sc.nextInt();
		System.out.println("Weight : "); weight = sc.nextDouble();
		System.out.println("Feet : "); feet = sc.nextDouble(); System.out.println("Inches : "); inches = sc.nextDouble();
		
		BMI p = new BMI(name,age,weight,feet,inches); 
		p.getBMI(); p.display();
		
	}

}
