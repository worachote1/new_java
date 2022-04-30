package Test_Exam;

import java.util.Arrays;
import java.util.Scanner;

public class test_1 {

	public static int[] sortBubble(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				
				if(arr[j]>=arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] sortSelection(int arr[])
	{

		for(int i=0;i<arr.length;i++)
		{
			int min_index = i;
			//find min
			for(int j=i;j<arr.length;j++)
			{
				if(arr[min_index]>arr[j])
				{
					min_index = j;
				}
			}
			
			//swap
			int temp= arr[i];
		   arr[i]=arr[min_index];
		   arr[min_index]=temp;
		}
		
		return arr;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		
		int a[] = {
				4,13,5,44,2,144,6
		};

		System.out.println("Before sort = "+Arrays.toString(a));
		
		//System.out.println("After bubble sort = "+Arrays.toString(sortBubble(a)));
		
		//System.out.println("After selection sort = "+Arrays.toString(sortSelection(a)));
		
		
	    
	}

}
