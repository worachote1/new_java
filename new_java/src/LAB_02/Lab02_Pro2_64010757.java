package LAB_02;

import java.util.Random;
import java.util.Scanner;
public class Lab02_Pro2_64010757 {

	public static void say(int player,int bot,int userResult)
	{
		String c[]= {"scissor","rock","paper"};

		String r[] = {". You lost"," too. It is a draw",". You won"};
	//test
	/*	System.out.println("[player] = "+player);
		System.out.println("bot = "+bot);
		System.out.println("[userResult] = "+userResult);
	*/
		
		System.out.print("The computer is "+c[bot]+". You are "+c[player]+r[userResult]);
	}
	public static void main(String[] args) {
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
			System.out.print("scissor (0), rock (1), paper (2): ");
			int a = sc.nextInt();
			int bot = rd.nextInt(3);
			//System.out.println(bot);
			
			//0 -> lost , 1->draw , 2->win
			 int result[][] = {
				 	 {1,0,2},
					 {2,1,0},
					 {0,2,1}
			 };
			 
			 
			 int userResult = result[a][bot];
			 say(a, bot, userResult);
	
			 
	}

}
