package EPT_ET_13;
import java.util.Arrays;
import java.util.Scanner;

public class ET4 {
	public static void displayReverse(String ss[],int n)
	{
		if(n<0)
		{
			return;
		}
		System.out.print(ss[n]);
		if(n != 0)
		{
			System.out.print(",\s");
		}
		displayReverse(ss, n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss[];
		ss = s.split(" ");
		//System.out.println(Arrays.toString(ss));
		displayReverse(ss, ss.length-1);
	}

}
