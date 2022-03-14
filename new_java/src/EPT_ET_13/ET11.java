package EPT_ET_13;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class ET11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Use HashMap
		HashMap<Character, Character> convertEngToTH = new HashMap<Character,Character>();
		
		convertEngToTH.put('1', '�'); convertEngToTH.put('!','+');
		convertEngToTH.put('2', '/'); convertEngToTH.put('@', '�');
		convertEngToTH.put('3', '-'); convertEngToTH.put('#', '�');
		convertEngToTH.put('4', '�'); convertEngToTH.put('$', '�');
		convertEngToTH.put('5', '�'); convertEngToTH.put('%', '�');
		convertEngToTH.put('6','�');  convertEngToTH.put('^', '�');
		convertEngToTH.put('7', '�'); convertEngToTH.put('&', '�');
		convertEngToTH.put('8', '�'); convertEngToTH.put('*', '�');
		convertEngToTH.put('9', '�'); convertEngToTH.put('(', '�');
		convertEngToTH.put('0', '�'); convertEngToTH.put(')', '�');
		convertEngToTH.put('-', '�'); convertEngToTH.put('_', '�');
		convertEngToTH.put('=', '�'); convertEngToTH.put('+', '�');
		
		convertEngToTH.put('q', '�'); convertEngToTH.put('Q', '�');
		convertEngToTH.put('w', '�'); convertEngToTH.put('W',  '"');
		convertEngToTH.put('e', '�'); convertEngToTH.put('E', '�');
		convertEngToTH.put('r', '�'); convertEngToTH.put('R', '�');
		convertEngToTH.put('t', '�'); convertEngToTH.put('T', '�');
		convertEngToTH.put('y', '�'); convertEngToTH.put('Y', '�');
		convertEngToTH.put('u', '�'); convertEngToTH.put('U', '�');
		convertEngToTH.put('i', '�'); convertEngToTH.put('I', '�');
		convertEngToTH.put('o', '�'); convertEngToTH.put('O', '�');
		convertEngToTH.put('p', '�'); convertEngToTH.put('P', '�');
		convertEngToTH.put('[', '�'); convertEngToTH.put('{', '�');
		convertEngToTH.put(']', '�'); convertEngToTH.put('}', ',');
		
		convertEngToTH.put('a', '�'); convertEngToTH.put('A', '�');
		convertEngToTH.put('s', '�'); convertEngToTH.put('S', '�');
		convertEngToTH.put('d', '�'); convertEngToTH.put('D', '�');
		convertEngToTH.put('f','�');  convertEngToTH.put('F', '�');
		convertEngToTH.put('g', '�');  convertEngToTH.put('G', '�');
		convertEngToTH.put('h', '�'); convertEngToTH.put('H', '�');
		convertEngToTH.put('j', '�'); convertEngToTH.put('J', '�');
		convertEngToTH.put('k', '�'); convertEngToTH.put('K', '�');
		convertEngToTH.put('l', '�'); convertEngToTH.put('L', '�');
		convertEngToTH.put(';', '�'); convertEngToTH.put(':', '�');
		convertEngToTH.put('\'', '�'); convertEngToTH.put('"', '.');
		
		convertEngToTH.put('z', '�'); convertEngToTH.put('Z', '(');
		convertEngToTH.put('x', '�'); convertEngToTH.put('X',')');
		convertEngToTH.put('c', '�'); convertEngToTH.put('C', '�');
		convertEngToTH.put('v', '�'); convertEngToTH.put('V', '�');
		convertEngToTH.put('b', '�'); convertEngToTH.put('B', '�');
		convertEngToTH.put('n', '�'); convertEngToTH.put('N', '�');
		convertEngToTH.put('m', '�'); convertEngToTH.put('M', '?');
		convertEngToTH.put(',', '�'); convertEngToTH.put('<', '�');
		convertEngToTH.put('.', '�'); convertEngToTH.put('>', '�');
		convertEngToTH.put('/', '�'); convertEngToTH.put('?', '�');
		
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
