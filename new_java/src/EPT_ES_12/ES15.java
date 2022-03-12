package EPT_ES_12;

import java.util.Scanner;

public class ES15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//top
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("_ ");
			}
			System.out.println(s.charAt(i));
		}
		//bottom
		for(int i=s.length()-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("_ ");
			}
			System.out.println(s.charAt(i));
		}
	}

}
