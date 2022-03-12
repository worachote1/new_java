package EPT_ES_12;

import java.util.Scanner;

public class ES17 {

	public static int countString(String s)
	{
		return s.length();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(countString(s));
	}

}
