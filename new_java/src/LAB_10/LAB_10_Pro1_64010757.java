package LAB_10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LAB_10_Pro1_64010757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r[] = new int[100];
		for(int i=0;i<r.length;i++)
		{
			r[i]= ThreadLocalRandom.current().nextInt();
		}
		System.out.println(Arrays.toString(r));
		
		try {
			System.out.println("Enter index : ");
			System.out.println(r[sc.nextInt()]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			//e.printStackTrace();
			System.out.println("Out of Bounds.");
		}
		
		System.out.println("test");
	}

}
