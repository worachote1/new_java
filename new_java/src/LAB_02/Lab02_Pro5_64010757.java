package LAB_02;

import java.util.Scanner;

public class Lab02_Pro5_64010757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the remember of line (1-15): ");
		int n=sc.nextInt();
	     
		for(int i=1;i<=n;i++) {
	        	for(int j=n;j>1;j--)
	        	{
	        		if(j<=i) System.out.print(j+" ");
	        		else System.out.print("  ");
	        	}
	        	
	        	for(int j=1;j<=n;j++)
	        	{
	        		if(j<=i) System.out.print(j+" ");
	        		//else System.out.print("  ");
	        	}
	            System.out.print("\n");
	        }

	}

}
