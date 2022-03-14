package EPT_ET_13;

import java.util.HashMap;
import java.util.Scanner;

public class ET12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Use HashMap
		HashMap<Character, Character> convertTHtoEng = new HashMap<Character,Character>();
		
		convertTHtoEng.put('å','1'); convertTHtoEng.put('+','!');
		convertTHtoEng.put('/','2'); convertTHtoEng.put('ñ','@');
		convertTHtoEng.put('-','3'); convertTHtoEng.put('ò','#');
		convertTHtoEng.put('À','4'); convertTHtoEng.put('ó','$');
		convertTHtoEng.put('¶','5'); convertTHtoEng.put('ô','%');
		convertTHtoEng.put('Ø','6');  convertTHtoEng.put('Ù','^');
		convertTHtoEng.put('Ö','7'); convertTHtoEng.put('ß','&');
		convertTHtoEng.put('¤','8'); convertTHtoEng.put('õ','*');
		convertTHtoEng.put('µ','9'); convertTHtoEng.put('ö','(');
		convertTHtoEng.put('¨','0'); convertTHtoEng.put('÷',')');
		convertTHtoEng.put('¢','-'); convertTHtoEng.put('ø','_');
		convertTHtoEng.put('ª','='); convertTHtoEng.put('ù','+');
		
		convertTHtoEng.put('æ','q');convertTHtoEng.put('ð','Q');
		convertTHtoEng.put('ä','w'); convertTHtoEng.put('"','W');
		convertTHtoEng.put('Ó','e'); convertTHtoEng.put('®','E');
		convertTHtoEng.put('¾','r'); convertTHtoEng.put('±','R');
		convertTHtoEng.put('Ð','t'); convertTHtoEng.put('¸','T');
		convertTHtoEng.put('Ñ','y'); convertTHtoEng.put('í','Y');
		convertTHtoEng.put('Õ','u'); convertTHtoEng.put('ê','U');
		convertTHtoEng.put('Ã','i'); convertTHtoEng.put('³','I');
		convertTHtoEng.put('¹','o'); convertTHtoEng.put('Ï','O');
		convertTHtoEng.put('Â','p'); convertTHtoEng.put('­','P');
		convertTHtoEng.put('º','['); convertTHtoEng.put('°','{');
		convertTHtoEng.put('Å',']'); convertTHtoEng.put(',','}');
		
		convertTHtoEng.put('¿','a'); convertTHtoEng.put('Ä','A');
		convertTHtoEng.put('Ë','s'); convertTHtoEng.put('¦','S');
		convertTHtoEng.put('¡','d'); convertTHtoEng.put('¯','D');
		convertTHtoEng.put('´','f');  convertTHtoEng.put('â','F');
		convertTHtoEng.put('à','g');  convertTHtoEng.put('¬','G');
		convertTHtoEng.put('é','h'); convertTHtoEng.put('ç','H');
		convertTHtoEng.put('è','j'); convertTHtoEng.put('ë','J');
		convertTHtoEng.put('Ò','k'); convertTHtoEng.put('É','K');
		convertTHtoEng.put('Ê','l'); convertTHtoEng.put('È','L');
		convertTHtoEng.put('Ç',';'); convertTHtoEng.put('«',':');
		convertTHtoEng.put('§','\''); convertTHtoEng.put('.','"');
		
		convertTHtoEng.put('¼','z'); convertTHtoEng.put('(','Z');
		convertTHtoEng.put('»','x'); convertTHtoEng.put(')','X');
		convertTHtoEng.put('á','c'); convertTHtoEng.put('©','C');
		convertTHtoEng.put('Í','v'); convertTHtoEng.put('Î','V');
		convertTHtoEng.put('Ô','b'); convertTHtoEng.put('Ú','B');
		convertTHtoEng.put('×','n'); convertTHtoEng.put('ì','N');
		convertTHtoEng.put('·','m'); convertTHtoEng.put('?','M');
		convertTHtoEng.put('Á',','); convertTHtoEng.put('²','<');
		convertTHtoEng.put('ã','.'); convertTHtoEng.put('Ì','>');
		convertTHtoEng.put('½','/'); convertTHtoEng.put('Æ','?');
	
		
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
