package EPT_ET_13;

import java.util.Arrays;
import java.util.Scanner;

public class ET_2 {

	public static void display(String ss[],int n)
	{
		if(ss.length-n>=ss.length) 
		{
			return;
		}
		System.out.print(ss[(ss.length-n)]);
		if(ss.length-n != ss.length-1)
		{
			System.out.print(", ");
		}
		display(ss,n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss[];
		ss = s.split(" ");
		//System.out.println(Arrays.toString(ss));
		display(ss,ss.length);
	}

}
