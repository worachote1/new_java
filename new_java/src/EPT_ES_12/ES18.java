package EPT_ES_12;

import java.util.Scanner;

public class ES18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); sc.nextLine();
		
		String ss1 = sc.nextLine();
		String ss2 = sc.nextLine();
		
		ss1 = ss1.substring(0, n)+ ss2.charAt(m) + ss1.substring(++n);
	
		System.out.println(ss1);
	}

}
