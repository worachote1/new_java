package EPT_ES_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ES2 {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader(new File("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\EPT_ES_12\\testFile_ES2_MercedezBenz.txt"));
			BufferedReader reader = new BufferedReader(fr);
			String ss = null;
			int c = 0;
			while((ss=reader.readLine())!=null)
			{
				for(int i=0;i<ss.length();i++)
				{
					if(ss.charAt(i)=='A' || ss.charAt(i) == 'a')
					{
						c++;
					}
				}
				System.out.println(ss);
			}
			System.out.println("\n\nEND.....\nThis text file have a,A = "+c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
