package LAB_08;

import java.util.Scanner;

public class LAB_08_Pro1_64010757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double side[] = new double[3]; // 7 5 10
		for(int i=0;i<side.length;i++)
		{
			System.out.println("Enter side "+(i+1)+" : ");
			side[i] = sc.nextDouble();
	        while (side[i] <= 0) {
	            System.out.println("Please enter side again : ");
	            side[i] = sc.nextDouble();
	        }
		}
		
		sc.nextLine();
		
		System.out.println("Enter color: ");
		String color = sc.nextLine();
		
		System.out.print("Enter is the triangle filled?: ");
	    Boolean filled = sc.nextBoolean();
	    
	    color = (filled) ? color : null;
	    
	    Triangle t = new Triangle(color, filled, side);
	    System.out.println(t);
      	}
}
