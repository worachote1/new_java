package EPT_ES_12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ES16 {

		public static void int2text(Integer num)
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
			
			String result = "";
//			System.out.println(billion);
//			System.out.println(hundred_million);
//			System.out.println(hundred_thousand);
//			System.out.println(hundred);
			
			String unit[] = {
					"","˹???","?ͧ","???","???","???","ˡ","????","Ỵ","????"
			};
			String tens[] = {
					"","?Ժ","????Ժ","????Ժ","????Ժ","????Ժ","ˡ?Ժ","?????Ժ","Ỵ?Ժ","?????Ժ"
			};
			
			//manage billion
			if(billion.charAt(0)!='0')
			{
				result += unit[(int)billion.charAt(0)%48]+"?ʹ";
			}
			else
			{
				
			}
			if(billion.charAt(1)!='0')
			{
				result += unit[(int)billion.charAt(1)%48]+"?????";
			}
			else
			{
				
			}
			if(billion.charAt(2)!='0')
			{
				result += unit[(int)billion.charAt(2)%48]+"?ѹ";
			}
			else
			{
				
			}
			
			//manage hundred_million
			if(hundred_million.charAt(0)!='0')
			{
				result += unit[(int)hundred_million.charAt(0)%48]+"????";
			}
			else
			{
				
			}
			if(hundred_million.charAt(1)!='0')
			{
				result += tens[(int)hundred_million.charAt(1)%48];
				if(hundred_million.charAt(2)=='1')
				{
					result += "????";
					result+="??ҹ";
				}
				else
				{
					result += unit[(int)hundred_million.charAt(2)%48];
					result+="??ҹ";
				}
				
			}
			else 
			{
				if(hundred_million.charAt(2)!='0')
				{
					result += unit[(int)hundred_million.charAt(2)%48];
					result+="??ҹ";
				}	
				
			}
			
			

			//manage hundred_thousand
			if(hundred_thousand.charAt(0)!='0')
			{
				result += unit[(int)hundred_thousand.charAt(0)%48]+"?ʹ";
			}
			else
			{
				
			}
			if(hundred_thousand.charAt(1)!='0')
			{
				result += unit[(int)hundred_thousand.charAt(1)%48]+"?????";
			}
			else
			{
				
			}
			if(hundred_thousand.charAt(2)!='0')
			{
				result += unit[(int)hundred_thousand.charAt(2)%48]+"?ѹ";
			}
			else
			{
				
			}	
			
			//manage hundred 
			if(hundred.charAt(0)!='0')
			{
				result += unit[(int)hundred.charAt(0)%48]+"????";
			}
			else
			{
				
			}
			if(hundred.charAt(1)!='0')
			{
				result += tens[(int)hundred.charAt(1)%48];
				if(hundred.charAt(2)=='1')
				{
					result += "????";
				}
				else
				{
					result += unit[(int)hundred.charAt(2)%48];
				}
			}
			else
			{
				result += unit[(int)hundred.charAt(2)%48];
			}
		
			System.out.print(result);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Integer s;
			do{
				 s = sc.nextInt();
				 if(s==-1)
				 {
					 break;
				 }
				int2text(s);
			}
			while(true);
					
			
	}
}

