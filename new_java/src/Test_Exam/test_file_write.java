package Test_Exam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test_file_write {

	public static void main(String[] args) {
		
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\Test_Exam\\testFile_Exam_prn.txt"));
			
			bw.write("Hellofsvsdffs 44 \n hrgf fdsf");
			bw.write("\n test fyfrewferfu");
			
			bw.close();
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
	}

}
