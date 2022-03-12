package EPT_ES_12;

import java.util.Scanner;

public class ES10 {
	 
	public static int convertRomanToDecimal(char c)
	    {
	    	switch(c) {
	    		case 'M' :
	    			return 1000;
	    		case 'D':
	    			return 500;
	    		case 'C':
	    			return 100;
	    		case 'L':
	    			return 50;
	    		case 'X' :
	    			return 10;
	    		case 'V' :
	    			return 5;
	    		case 'I' :
	    			return 1;
	    	}
	    	return -1;
	    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String romanNumber = sc.nextLine();
	    int sum = 0;
	    for(int i=0;i<romanNumber.length();i++)
	    {
	    	int n1 = convertRomanToDecimal(romanNumber.charAt(i));
	    	if(i!=romanNumber.length()-1)
	    	{
	    		int n2  = convertRomanToDecimal(romanNumber.charAt(i+1));
	    		if(n1<n2)
	    		{
	    			sum += (n2-n1);
	    			i++;
	    		}
	    		else
	    		{
	    			sum += n1;
	    		}
	    	}
	    	else
	    	{
	    		sum += n1;
	    	}
	    }
	    System.out.println(sum);
	}

}
