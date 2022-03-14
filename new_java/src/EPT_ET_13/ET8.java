package EPT_ET_13;

import java.util.Arrays;
import java.util.Scanner;

public class ET8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t,from,to;
		t=sc.nextLine();
		from=sc.nextLine();
		to=sc.nextLine();
		
		System.out.println(Arrays.toString(t.split(from)));
		String ss[] = t.split(from);
		if(ss.length != 0)
		{
			for(int i=0;i<ss.length;i++)
			{
				if(i != 0) 
				{
					System.out.print(to+ss[i]);
				}
				else
				{
					System.out.print(ss[i]);
				}
			}		
		}
	}
}
