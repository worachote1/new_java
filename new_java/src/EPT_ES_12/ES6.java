package EPT_ES_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ES6 {
	public static void search(String name) throws IOException
	{
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(new File("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\EPT_ES_12\\testFile_ES5.txt"));
			br = new BufferedReader(fr);
			
			String ss = null;
			while((ss = br.readLine()) != null)
			{
				String firstName,surName,sex,phone,email;
				String data[] = ss.split(",");
				//System.out.println(Arrays.toString(data));
				firstName = data[0]; surName = data[1]; sex = data[2]; phone = data[3]; email = data[4];
				
				if(name.toLowerCase().trim().equals(firstName.toLowerCase()))
				{
					System.out.println("Name : "+firstName+" "+surName);
					System.out.println("Sex : "+sex);
					System.out.println("Phone : "+phone);
					System.out.println("Email : "+email);
					
					break;
				}
				else
				{
					
				}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("User Input(First Name) : ");
		search(sc.nextLine());
	}

}
