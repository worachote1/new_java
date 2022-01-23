package LAB_03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab03_Pro3_64010757 {

	public static void display(int m[][])
	{
		for(int i=0;i<m.length;i++)
		{ 
			for(int j=0;j<m[0].length;j++)
			{
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
	
	//check All Row
	public static void checkAllRow(int m[][])
	{
		int arrZero[] = new int[m.length]; int z_index = 0;
		int arrOne[] = new int[m.length]; int o_index = 0;
		//store garbage in arr
		for(int i=0;i<m.length;i++)
		{
			arrZero[i] = -1;
			arrOne[i] = -1;
		}
		int c1=0,c2=0;
		for(int i=0;i<m.length;i++)
		{
			int sum = 0;
			for(int j=0;j<m[0].length;j++)
			{
				sum += m[i][j];
			}
		//	System.out.println("sum = "+sum);
			if(sum==0)
			{
				arrZero[z_index++] = i; c1++; //System.out.print("test sum== 0 -> "+sum);
			}
			if(sum==m.length) 
			{
				arrOne[o_index++] = i; c2++; //System.out.println("test sum== 4 -> "+sum);
			}
				
			//test 
			//System.out.println(arrZero[i]);
		}
		//System.out.println();
		if(c1==0&&c2==0) System.out.println("No same numbers on a row");
		else {
			if(c1!=0)
			{
				System.out.print("All "+0+"s on row ");
				for(int i=0;i<arrZero.length;i++) if(arrZero[i] != -1) System.out.print(arrZero[i]+" "); 			
				System.out.println();
			}

			if(c2!=0)
			{
				System.out.print("All "+1+"s on row ");
				for(int i=0;i<arrOne.length;i++) if(arrOne[i] != -1) System.out.print(arrOne[i]+" "); 		
				System.out.println();
			}
			
			//System.out.println();
		}
	//	System.out.println("Test -> "+Arrays.toString(arr));
	}
	
	//Check All column
	public static void checkAllCol(int m[][])
	{
		int arrZero[] = new int[m[0].length]; int z_index = 0;
		int arrOne[] = new int[m[0].length]; int o_index = 0;
		//store garbage in arr
		for(int i=0;i<m.length;i++)
		{
			arrZero[i] = -1;
			arrOne[i] = -1;
		}
		int c1=0,c2=0;
		for(int j=0;j<m.length;j++)
		{
			int sum = 0;
			for(int i=0;i<m.length;i++)
			{
				sum += m[i][j];
			}
		//	System.out.println("sum = "+sum);
			if(sum==0)
			{
				arrZero[z_index++] = j; c1++; //System.out.print("test sum== 0 -> "+sum);
			}
			if(sum==m.length) 
			{
				arrOne[o_index++] = j; c2++; //System.out.println("test sum== 4 -> "+sum);
			}
	
		}
		if(c1==0&&c2==0) System.out.println("No same numbers on a column");
		else {
			if(c1!=0)
			{
				System.out.print("All "+0+"s on column ");
				for(int i=0;i<arrZero.length;i++) if(arrZero[i] != -1) System.out.print(arrZero[i]+" "); 	
				System.out.println();
			}
			if(c2!=0)
			{
				System.out.print("All "+1+"s on column ");
				for(int i=0;i<arrOne.length;i++) if(arrOne[i] != -1) System.out.print(arrOne[i]+" "); 
				System.out.println();
			}
		}
	}	
	
//Check Diagonal
	public static void checkDiagonal(int m[][])
	{
		int sum = 0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				if(j==i) sum += m[i][j];
			}
		}
		if(sum==0) 
		{
			System.out.println("All 0s on the diagonal");
		}
		if(sum==m.length) 
		{ 
			System.out.println("All 1s on the diagonal");
		}
		else if(sum != 0 && sum != m.length) 
		{
			System.out.println("No same numbers on the diagonal");
		}
	}		
	
//Check Super Diagonal
	public static void checkSuperDiagonal(int m[][])
	{
		int sum = 0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				if(j==i+1) sum += m[i][j];
			}
		}
		if(sum==0 && m.length!=1) 
			{
				System.out.println("All 0s on the superdiagonal");
			}
		if(sum==m.length-1 && m.length!=1) 
		{
			System.out.println("All 1s on the superdiagonal");
		}
		else if(sum != 0 && sum != m.length || m.length==1)
		{
			System.out.println("No same numbers on the superdiagonal");
		}
	}		
	
//Check Sub Diagonal
	public static void checkSubDiagonal(int m[][])
	{
		int sum = 0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				if(j==i-1 && i!=0) sum += m[i][j];
			}
		}
		if(sum==0 && m.length!=1) 
		{ 
			System.out.println("All 0s on the subdiagonal");
		}
		if(sum==m.length-1 && m.length!=1) 
		{
			System.out.println("All 1s on the subdiagonal");
		}
		else if(sum != 0 && sum != m.length || m.length==1)
		{
			System.out.println("No same numbers on the subdiagonal");
		}
	}	
	
	//Display All the result depend on problems
	public static void displayAll(int m[][])
	{
		checkAllRow(m);
		checkAllCol(m);
		checkSuperDiagonal(m);
		checkDiagonal(m);
		checkSubDiagonal(m);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int n =sc.nextInt();
		int m [][] = new int [n][n];
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				m[i][j] = (int)(Math.random() * 2);
			}
		}
		
		display(m);
		displayAll(m);
	}

}
