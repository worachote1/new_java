package EPT_ES_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ES1 {

	public static void main(String[] args) throws IOException  {
		/*
		 C:\\Users\\User PC\\git\\new_java\\new_java\\src\\EPT_ES_12\\testFile_ES1.txt
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(new File("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\EPT_ES_12\\testFile_ES1.txt"));
			BufferedReader reader = new BufferedReader(fr);
			String ss = null;
			while((ss = reader.readLine()) != null)
			{
				System.out.println(ss);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
