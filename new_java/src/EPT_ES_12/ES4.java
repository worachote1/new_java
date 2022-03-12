package EPT_ES_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ES4 {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader(new File("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\EPT_ES_12\\testFile_ES4.txt"));
			BufferedReader reader = new BufferedReader(fr);
			String ss = null;
			int count_eachChar[] = new int[26];
			final int START_CHAR = 97,END_CHAR = 122;
			while((ss=reader.readLine())!=null)
			{
				for(int i=0;i<ss.length();i++)
				{
					int check = (int)ss.charAt(i);
					if(check >= START_CHAR && check <= END_CHAR)
					{
						count_eachChar[(check % START_CHAR)]++;
					}
				}
				System.out.println(ss);
			}
			System.out.println("\nEND.....");
			for(int i=0;i<count_eachChar.length;i++)
			{
				System.out.println(((char)(i+START_CHAR))+" = "+count_eachChar[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		//test char ascii 
//		char a = 'a'; char z = 'z'; char c = 'c';
//		System.out.println((int)a % 97);
//		System.out.println((int)z % 97);
//		System.out.println((int)c % 97);
//		char b = 'b';
//		System.out.println((char)98);
	}
}
