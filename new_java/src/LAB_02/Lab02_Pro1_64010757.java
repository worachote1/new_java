package LAB_02;

import java.util.Scanner;
public class Lab02_Pro1_64010757 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String days[] = {
				"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"
		};
		byte toDay,passDay;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter today's day: "); toDay = sc.nextByte(); 
		System.out.print("Enter the number of days elapsed since today: "); passDay = sc.nextByte();
	
		System.out.println("Today is "+days[toDay]+
				" and the future day is " +days[(toDay+passDay)%7]);		
	}
}
