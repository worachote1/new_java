package EPT_ET_13;
import java.util.Arrays;
import java.util.Scanner;

public class ET3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss[];
		ss = s.split(" ");
		System.out.println(Arrays.toString(ss));
		System.out.println("world count : "+ss.length);
	}

}
