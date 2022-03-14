package EPT_ET_13;

import java.util.Scanner;

public class ET10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char last = s.charAt(s.length()-1);
		char almostLast = s.charAt((s.length()-1)-1);
		if(last == 's' || last =='x' || (last =='h' && almostLast == 'c') )
		{
			System.out.println(s+"es");
		}
		else if(last == 'y')
		{
			char vowel[]={'a','e','i','o','u'};
			for(int i=0;i<vowel.length;i++)
			{
				if(almostLast == vowel[i])
				{
					System.out.println(s+"s");
					return;
				}
			}
			System.out.println(s.substring(0, s.length()-1)+"i"+"es");
		}
		else
		{
			System.out.println(s+"s");
		}
	}

}
