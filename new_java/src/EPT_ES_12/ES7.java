package EPT_ES_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ES7 {

	public static void main(String[] args) {
		try {
			//How to read thai text file
		    FileInputStream fis = new FileInputStream(new File("C:\\Users\\User PC\\git\\new_java\\new_java\\src\\EPT_ES_12\\testFile_ES7.txt"));
		    InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		    BufferedReader br = new BufferedReader(isr);
		    String line;
		    int count[] = new int[4];
		    while((line = br.readLine()) != null) {
		            System.out.println(line);
		            for(int i=0;i<line.length();i++)
		            {
		            	switch(line.charAt(i)) 
		            	{
		            		case '�':
		            			count[0]++; break;
		            		case '�':
		            			count[1]++; break;
		            		case '�'	:
		            			count[2]++; break;
		            		case '�':
		            			count[3]++; break;
		            	}
		            }
		    }
		    
		    //find max index
		    int max = count[0]; 
		    int max_index = 0;
		    for(int i=0;i<count.length;i++)
		    {
		    	if(max < count[i])
		    	{
		    		max = count[i];
		    		max_index = i;
		    	}
		    }
		    
		    System.out.println("����͡ : "+count[0]);
		    System.out.println("���� : "+count[1]);
		    System.out.println("����� : "+count[2]);
		    System.out.println("���ѵ�� : "+count[3]);
		    
        	switch(max_index) 
        	{
        		case 0:
        			System.out.println("The most : ����͡"); break;
        		case 1:
        			System.out.println("The most : ����"); break;
        		case 2:
        			System.out.println("The most : �����"); break;
        		case 3:
        			System.out.println("The most : ���ѵ��"); break;
        	}
		    System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (UnsupportedEncodingException e) {
		    System.err.println("The system does not support UTF-8");            
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
