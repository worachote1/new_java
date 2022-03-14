package EPT_ET_13;

import java.util.HashMap;
import java.util.Scanner;

public class ET12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Use HashMap
		HashMap<Character, Character> convertTHtoEng = new HashMap<Character,Character>();
		
		convertTHtoEng.put('�','1'); convertTHtoEng.put('+','!');
		convertTHtoEng.put('/','2'); convertTHtoEng.put('�','@');
		convertTHtoEng.put('-','3'); convertTHtoEng.put('�','#');
		convertTHtoEng.put('�','4'); convertTHtoEng.put('�','$');
		convertTHtoEng.put('�','5'); convertTHtoEng.put('�','%');
		convertTHtoEng.put('�','6');  convertTHtoEng.put('�','^');
		convertTHtoEng.put('�','7'); convertTHtoEng.put('�','&');
		convertTHtoEng.put('�','8'); convertTHtoEng.put('�','*');
		convertTHtoEng.put('�','9'); convertTHtoEng.put('�','(');
		convertTHtoEng.put('�','0'); convertTHtoEng.put('�',')');
		convertTHtoEng.put('�','-'); convertTHtoEng.put('�','_');
		convertTHtoEng.put('�','='); convertTHtoEng.put('�','+');
		
		convertTHtoEng.put('�','q');convertTHtoEng.put('�','Q');
		convertTHtoEng.put('�','w'); convertTHtoEng.put('"','W');
		convertTHtoEng.put('�','e'); convertTHtoEng.put('�','E');
		convertTHtoEng.put('�','r'); convertTHtoEng.put('�','R');
		convertTHtoEng.put('�','t'); convertTHtoEng.put('�','T');
		convertTHtoEng.put('�','y'); convertTHtoEng.put('�','Y');
		convertTHtoEng.put('�','u'); convertTHtoEng.put('�','U');
		convertTHtoEng.put('�','i'); convertTHtoEng.put('�','I');
		convertTHtoEng.put('�','o'); convertTHtoEng.put('�','O');
		convertTHtoEng.put('�','p'); convertTHtoEng.put('�','P');
		convertTHtoEng.put('�','['); convertTHtoEng.put('�','{');
		convertTHtoEng.put('�',']'); convertTHtoEng.put(',','}');
		
		convertTHtoEng.put('�','a'); convertTHtoEng.put('�','A');
		convertTHtoEng.put('�','s'); convertTHtoEng.put('�','S');
		convertTHtoEng.put('�','d'); convertTHtoEng.put('�','D');
		convertTHtoEng.put('�','f');  convertTHtoEng.put('�','F');
		convertTHtoEng.put('�','g');  convertTHtoEng.put('�','G');
		convertTHtoEng.put('�','h'); convertTHtoEng.put('�','H');
		convertTHtoEng.put('�','j'); convertTHtoEng.put('�','J');
		convertTHtoEng.put('�','k'); convertTHtoEng.put('�','K');
		convertTHtoEng.put('�','l'); convertTHtoEng.put('�','L');
		convertTHtoEng.put('�',';'); convertTHtoEng.put('�',':');
		convertTHtoEng.put('�','\''); convertTHtoEng.put('.','"');
		
		convertTHtoEng.put('�','z'); convertTHtoEng.put('(','Z');
		convertTHtoEng.put('�','x'); convertTHtoEng.put(')','X');
		convertTHtoEng.put('�','c'); convertTHtoEng.put('�','C');
		convertTHtoEng.put('�','v'); convertTHtoEng.put('�','V');
		convertTHtoEng.put('�','b'); convertTHtoEng.put('�','B');
		convertTHtoEng.put('�','n'); convertTHtoEng.put('�','N');
		convertTHtoEng.put('�','m'); convertTHtoEng.put('?','M');
		convertTHtoEng.put('�',','); convertTHtoEng.put('�','<');
		convertTHtoEng.put('�','.'); convertTHtoEng.put('�','>');
		convertTHtoEng.put('�','/'); convertTHtoEng.put('�','?');
	
		
		String s = sc.nextLine();
		for(int k=0;k<s.length();k++)
		{ 
			if(convertTHtoEng.containsKey(s.charAt(k)))
			{
				System.out.print(convertTHtoEng.get(s.charAt(k)));
			}
			else
			{
				System.out.print(s.charAt(k));
			}
		}
		

	}

}
