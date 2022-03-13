package EPT_ES_12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ES19 {

	public static String convertHaveHundred(String s)
	{
		String result ="";
		String unit[] = {
				"","˹��","�ͧ","���","���","���","ˡ","��","Ỵ","���"
		};
		String tens[] = {
				"","�Ժ","����Ժ","����Ժ","����Ժ","����Ժ","ˡ�Ժ","���Ժ","Ỵ�Ժ","����Ժ"
		};
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='0') 
			{
				if(i==0)
				{
					result += unit[(int)s.charAt(i)%48];
					result += "����";
				}
				else if(i==1)
				{
					result += tens[(int)s.charAt(i)%48];
					if(s.charAt(2)=='1')
					{
						result += "���";
						i++; //skip i==2 process
					}
				}
				else // i==2
				{
					result += tens[(int)s.charAt(i)%48];
				}				
			}
		}
		return result;
	}
	public static String convertHaveThousand(String s)
	{
		String result="";
		String unit[] = {
				"","˹��","�ͧ","���","���","���","ˡ","��","Ỵ","���"
		};
		String k[]= {
				"�ʹ","����","�ѹ"
		};
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='0')
			{
				result += unit[(int)s.charAt(i)%48]+k[i];
			}
		}
		return result;
	}
	public static void int2text(int num)
	{
		

		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		String test = df.format(num);
		if(test.charAt(0) == '-')
		{
			System.out.print("ź");
			test = test.substring(1);
		}
		
		String billion = test.substring(0,3);
		String hundred_million = test.substring(3,6);
		String hundred_thousand = test.substring(6, 9);
		String hundred = test.substring(9,12);
//		System.out.println(billion);
//		System.out.println(hundred_million);
//		System.out.println(hundred_thousand);
//		System.out.println(hundred);
	
		String result = "";
		//manage billion
		result += convertHaveThousand(billion);
		
		//manage hundred_million
		result += convertHaveHundred(hundred_million);
		result += "��ҹ";	
		
		//manage hundred_thousand
		result += convertHaveThousand(hundred_thousand);

		//manage hundred 
		result += convertHaveHundred(hundred);
		
		System.out.print(result);
	}
	public static void main(String[] args) {
		int2text(-1311480221);	
	}
}
