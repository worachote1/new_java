package EPT_ET_13;

import java.util.Scanner;

public class ET6 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String t,p; 
		
		t = sc.nextLine();
		p = sc.nextLine();
		
		int count=1,k=0;
		while(true)
		{
			if((t.indexOf(p,k)) != -1)
			{
				count++;
				k = t.indexOf(p,k)+1;
			}
			else
			{
				break;
			}
		}
		System.out.println(count);	
	}
}
