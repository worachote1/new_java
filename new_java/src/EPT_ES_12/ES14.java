package EPT_ES_12;

import java.util.Scanner;

public class ES14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("_ ");
			}
			System.out.println(s.charAt(i));
		}
	}

}
