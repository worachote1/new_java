package LAB_02;

import java.util.Random;
import java.util.Scanner;
public class Lab02_Pro2_64010757 {

	public static void say(int bot,int player)
	{
		System.out.print("The computer is "+bot+". You are "+player+".");		
	}
	public static void main(String[] args) {
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
			System.out.print("scissor (0), rock (1), paper (2): ");
			int a = sc.nextInt();
			int bot = rd.nextInt(3);
			//System.out.println(bot);
			char c='x';
			if(a==0)
			{
				if(bot==a)
				{
					c='d'; 
				}
				else c = (bot==2) ? 'w' : 'l';
			}
			else if(a==1)
			{
				if(bot==a)
				{
					c='d'; 
					return;
				}
				else c = (bot==0) ? 'w' : 'l';
			}
			else if(a==2)
			{
				if(bot==a)
				{
					c='d'; 
					return;
				}
				else c = (bot==1) ? 'w' : 'l';				
			}
			
			//result
			if(c=='d')
			{
				say(bot,a);
				System.out.print(" It is a draw");
			}
			else
			{
				if(c=='w') 
				{
					say(bot, a); System.out.print(" You won");
				}
				if(c=='l') 
				{
					say(bot,a); System.out.print(" You lose");
				}
			}
	}

}
