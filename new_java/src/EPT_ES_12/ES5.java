package EPT_ES_12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ES5 {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);
		try {
			fw = new FileWriter(new File("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\EPT_ES_12\\testFile_ES5.txt")
					,true);
			pw = new PrintWriter(fw);
			String firstName=null,surName=null,sex=null,phone=null,email=null;
		
			while(true)
			{
				System.out.print("FirstName : ");
				firstName = sc.nextLine(); 
				
				System.out.print("SurName : ");
				surName = sc.nextLine(); 
				
				System.out.print("Sex : ");
				sex = sc.nextLine(); 
				
				System.out.print("Phone : ");
				phone = sc.nextLine(); 
				
				System.out.print("Email : ");
				email = sc.nextLine(); 
				

				System.out.println("Continue (y/n) ? :");
				char charEnd = sc.next().charAt(0); sc.nextLine();
				
				//write data to file
				pw.println(firstName+","+surName+","+sex+","+phone+","+email);
			
				if(charEnd == 'n')
				{
					break;
				}
				else
				{
					
				}
			}
			
			pw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
