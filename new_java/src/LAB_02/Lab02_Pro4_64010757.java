package LAB_02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab02_Pro4_64010757 {

	public static void main(String[] args) {
		
		String s[] = new String[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first city: ");
		s[0] = sc.nextLine();
		System.out.println("Enter the second city: ");
		s[1] = sc.nextLine();		
		System.out.println("Enter the third city: ");
		s[2] = sc.nextLine();	
		String temp;
		for(int i=0;i<s.length;i++)
		{
			for(int j=1;j<3;j++)
			{
				if(s[j-1].compareTo(s[j])>0)
				{
					temp = s[j-1];
					s[j-1]=s[j];
					s[j] = temp;
				}
			}
		}
		
		System.out.println("The three cities in alphabetical order are "+s[0]+" "+s[1]+" "+s[2]);
	
	}

}
