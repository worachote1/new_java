package Test_Exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test_file_read {

	public static void main(String[] args) throws IOException  {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\Test_Exam\\testFile_Exam_prn.txt"));
			
	        String ss;
	        while((ss=br.readLine()) != null)
	        {
	        	System.out.println(ss);
	        }
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
