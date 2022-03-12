package EPT_ES_12;

import java.util.Arrays;
import java.util.Scanner;

public class ES12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		String s[] = new String[n];
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		}
		
		int max = s[0].length();
		int max_index = 0;
		for(int i=0;i<s.length;i++)
		{
			if(max < s[i].length())
			{
				max = s[i].length();
				max_index = i;
			}
		}
		System.out.println("The Largest String = "+s[max_index]);
		//System.out.println(Arrays.toString(s));
	}

}
