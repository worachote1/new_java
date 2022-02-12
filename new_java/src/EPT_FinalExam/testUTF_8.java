package EPT_FinalExam;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class testUTF_8 {

	public static void main(String[] args) {
		
        try {
            File utf8FilePath = new File("D://test_virus.dll");
 
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(utf8FilePath) ,"UTF8"));
 
            //String line = null;
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char)ch);
            }
            reader.close();
 
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }		

	}

}
