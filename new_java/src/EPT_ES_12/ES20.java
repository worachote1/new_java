package EPT_ES_12;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ES20 {

	public static void double2text(double d,int p)
	{
		

		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		String test = df.format(d);
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
//		System.out.println(billion);
//		System.out.println(hundred_million);
//		System.out.println(hundred_thousand);
//		System.out.println(hundred);
		
		String unit[] = {
				"","˹��","�ͧ","���","���","���","ˡ","��","Ỵ","���"
		};
		String tens[] = {
				"","�Ժ","����Ժ","����Ժ","����Ժ","����Ժ","ˡ�Ժ","���Ժ","Ỵ�Ժ","����Ժ"
		};
		
		//manage billion
		if(billion.charAt(0)!='0')
		{
			result += unit[(int)billion.charAt(0)%48]+"�ʹ";
		}
		else
		{
			
		}
		if(billion.charAt(1)!='0')
		{
			result += unit[(int)billion.charAt(1)%48]+"����";
		}
		else
		{
			
		}
		if(billion.charAt(2)!='0')
		{
			result += unit[(int)billion.charAt(2)%48]+"�ѹ";
		}
		else
		{
			
		}
		
		//manage hundred_million
		if(hundred_million.charAt(0)!='0')
		{
			result += unit[(int)hundred_million.charAt(0)%48]+"����";
		}
		else
		{
			
		}
		if(hundred_million.charAt(1)!='0')
		{
			result += tens[(int)hundred_million.charAt(1)%48];
			if(hundred_million.charAt(2)=='1')
			{
				result += "���";
				result+="��ҹ";
			}
			else
			{
				result += unit[(int)hundred_million.charAt(2)%48];
				result+="��ҹ";
			}
		}
		else 
		{
			if(hundred_million.charAt(2)!='0')
			{
				result += unit[(int)hundred_million.charAt(2)%48];
				result+="��ҹ";
			}			
		}
		
		

		//manage hundred_thousand
		if(hundred_thousand.charAt(0)!='0')
		{
			result += unit[(int)hundred_thousand.charAt(0)%48]+"�ʹ";
		}
		else
		{
			
		}
		if(hundred_thousand.charAt(1)!='0')
		{
			result += unit[(int)hundred_thousand.charAt(1)%48]+"����";
		}
		else
		{
			
		}
		if(hundred_thousand.charAt(2)!='0')
		{
			result += unit[(int)hundred_thousand.charAt(2)%48]+"�ѹ";
		}
		else
		{
			
		}	
		
		//manage hundred 
		if(hundred.charAt(0)!='0')
		{
			result += unit[(int)hundred.charAt(0)%48]+"����";
		}
		else
		{
			
		}
		if(hundred.charAt(1)!='0')
		{
			result += tens[(int)hundred.charAt(1)%48];
			if(hundred.charAt(2)=='1')
			{
				result += "���";
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
	
		//manage dot decimal
		String startDot[] = Double.toString(d).split("\\.");
		System.out.println(Arrays.toString(startDot));
		result += "�ش";
		for(int i=0;i<=p-1;i++)
		{
			result += unit[(int)startDot[1].charAt(i)%48];
		}
		System.out.print(result);
	}
	public static void main(String[] args) {
		
		double2text(-25.374,2);	
	
	}

}
