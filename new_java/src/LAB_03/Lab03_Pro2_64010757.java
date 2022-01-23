package LAB_03;

import java.util.*;
import java.io.*;
public class Lab03_Pro2_64010757 {

	 public static int[] merge(int[] list1, int[] list2)
	 {
		 //split 2 arrays into 2 parts
		 //list1 is left, list2 is right
		 int left = 0;
		 int mid = list1.length-1;
		 int right = list2.length-1;
		 
		 int left_arr[] = new int[list1.length];
		 int right_arr[] = new int[list2.length];
		 
		 for(int i=0;i<left_arr.length;i++)
		 {
			 left_arr[i]=list1[i];
		 }
		 for(int i=0;i<right_arr.length;i++)
		 {
			 right_arr[i]=list2[i];
		 }
		 
		 int index_left=0,index_right=0;
		 int temp[] = new int [list1.length+list2.length];
		 int temp_index = 0;
		 while(index_left <= mid && index_right<=right)
		 {
			 if(left_arr[index_left]<=right_arr[index_right])
			 {
				 temp[temp_index++]=left_arr[index_left++];
			 }
			 else if(right_arr[index_right]<=left_arr[index_left])
			 {
				 temp[temp_index++]=right_arr[index_right++];
			 }
		 }
		 
		//merge for remaining either sub-left or sub-right
		 while(index_left <= mid)
		 {
			 temp[temp_index++]=left_arr[index_left++];
		 }
		 while(index_right<=right)
		 {
			 temp[temp_index++]=right_arr[index_right++];
		 }
		 
		 return temp;
	 }
	 
	 public static void setToArray(int num,int arr[])
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 for(int i=0;i<num;i++)
		 {
			 arr[i] =  sc.nextInt();
		 }
		 System.out.println();
	 }
	public static void main(String[] args) {
		/*
		 Write the following method that merges two sorted lists into a new sorted list.
		 
		 public static int[] merge(int[] list1, int[] list2)
		  */
			
		//Note that the first number in the input
		//indicates the number of the elements in the list.
		
		Scanner sc = new Scanner(System.in);
		int n=0; 
		
		System.out.print("Enter list1: ");
		n = sc.nextInt();
		int list1[] = new int [n];
		setToArray(n, list1);
		
		System.out.print("Enter list2: ");
		n = sc.nextInt();
		int list2[] = new int [n];
		setToArray(n, list2);
		
		
//		System.out.println(Arrays.toString(list1));
//		System.out.println(Arrays.toString(list2));
		
		int c[];
		c = new int [list1.length+list2.length];
		c = merge(list1, list2);
		
		//System.out.println(c[2]);
		//System.out.println(Arrays.toString(c));
		
		System.out.print("The merged list is ");
	    for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
