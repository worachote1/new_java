package EPT_ET_13;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class ET11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Use HashMap
		HashMap<Character, Character> convertEngToTH = new HashMap<Character,Character>();
		
		convertEngToTH.put('1', 'å'); convertEngToTH.put('!','+');
		convertEngToTH.put('2', '/'); convertEngToTH.put('@', 'ñ');
		convertEngToTH.put('3', '-'); convertEngToTH.put('#', 'ò');
		convertEngToTH.put('4', 'À'); convertEngToTH.put('$', 'ó');
		convertEngToTH.put('5', '¶'); convertEngToTH.put('%', 'ô');
		convertEngToTH.put('6','Ø');  convertEngToTH.put('^', 'Ù');
		convertEngToTH.put('7', 'Ö'); convertEngToTH.put('&', 'ß');
		convertEngToTH.put('8', '¤'); convertEngToTH.put('*', 'õ');
		convertEngToTH.put('9', 'µ'); convertEngToTH.put('(', 'ö');
		convertEngToTH.put('0', '¨'); convertEngToTH.put(')', '÷');
		convertEngToTH.put('-', '¢'); convertEngToTH.put('_', 'ø');
		convertEngToTH.put('=', 'ª'); convertEngToTH.put('+', 'ù');
		
		convertEngToTH.put('q', 'æ'); convertEngToTH.put('Q', 'ð');
		convertEngToTH.put('w', 'ä'); convertEngToTH.put('W',  '"');
		convertEngToTH.put('e', 'Ó'); convertEngToTH.put('E', '®');
		convertEngToTH.put('r', '¾'); convertEngToTH.put('R', '±');
		convertEngToTH.put('t', 'Ð'); convertEngToTH.put('T', '¸');
		convertEngToTH.put('y', 'Ñ'); convertEngToTH.put('Y', 'í');
		convertEngToTH.put('u', 'Õ'); convertEngToTH.put('U', 'ê');
		convertEngToTH.put('i', 'Ã'); convertEngToTH.put('I', '³');
		convertEngToTH.put('o', '¹'); convertEngToTH.put('O', 'Ï');
		convertEngToTH.put('p', 'Â'); convertEngToTH.put('P', '­');
		convertEngToTH.put('[', 'º'); convertEngToTH.put('{', '°');
		convertEngToTH.put(']', 'Å'); convertEngToTH.put('}', ',');
		
		convertEngToTH.put('a', '¿'); convertEngToTH.put('A', 'Ä');
		convertEngToTH.put('s', 'Ë'); convertEngToTH.put('S', '¦');
		convertEngToTH.put('d', '¡'); convertEngToTH.put('D', '¯');
		convertEngToTH.put('f','´');  convertEngToTH.put('F', 'â');
		convertEngToTH.put('g', 'à');  convertEngToTH.put('G', '¬');
		convertEngToTH.put('h', 'é'); convertEngToTH.put('H', 'ç');
		convertEngToTH.put('j', 'è'); convertEngToTH.put('J', 'ë');
		convertEngToTH.put('k', 'Ò'); convertEngToTH.put('K', 'É');
		convertEngToTH.put('l', 'Ê'); convertEngToTH.put('L', 'È');
		convertEngToTH.put(';', 'Ç'); convertEngToTH.put(':', '«');
		convertEngToTH.put('\'', '§'); convertEngToTH.put('"', '.');
		
		convertEngToTH.put('z', '¼'); convertEngToTH.put('Z', '(');
		convertEngToTH.put('x', '»'); convertEngToTH.put('X',')');
		convertEngToTH.put('c', 'á'); convertEngToTH.put('C', '©');
		convertEngToTH.put('v', 'Í'); convertEngToTH.put('V', 'Î');
		convertEngToTH.put('b', 'Ô'); convertEngToTH.put('B', 'Ú');
		convertEngToTH.put('n', '×'); convertEngToTH.put('N', 'ì');
		convertEngToTH.put('m', '·'); convertEngToTH.put('M', '?');
		convertEngToTH.put(',', 'Á'); convertEngToTH.put('<', '²');
		convertEngToTH.put('.', 'ã'); convertEngToTH.put('>', 'Ì');
		convertEngToTH.put('/', '½'); convertEngToTH.put('?', 'Æ');
		
		String s = sc.nextLine();
		for(int k=0;k<s.length();k++)
		{ 
			if(convertEngToTH.containsKey(s.charAt(k)))
			{
				System.out.print(convertEngToTH.get(s.charAt(k)));
			}
			else
			{
				System.out.print(s.charAt(k));
			}
		}
		
	}

}
