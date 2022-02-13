package EPT_FinalExam;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.file.Files;
public class Ex2_VirusScanner {

	// "D:/test_virus.dll"
	public static void main(String[] args) {
		try {
			//File file = new File("D:/test_virus.dll");
			//-----Test using .readAllByte
			byte[] fileContent = Files.readAllBytes(Paths.get("D:/test_virus.dll"));
			System.out.println("fileContent : ");
			System.out.println(Arrays.toString(fileContent));
			//------------------
			int ch;
			int count = 0;
			//test how to check sequence
			final int SIZE_OF_SEQUENCE = 17; 
			
			final int VIRUS_ARR[] = {
				0x0A , 0x13 , 0x6F , 0x29 ,
				0x35 , 0x18 , 0x70 , 0x00 ,
				0x03 , 0x35 , 0x42 , 0x73 ,
				0x9C , 0xAD , 0xFA , 0x6C ,
				0xAD
			};
			//BUT I FOUND AT 0x73 ?
			System.out.println("VIRUS_ARR : ");
			for(int m=0;m<VIRUS_ARR.length;m++)
			{
				System.out.print(VIRUS_ARR[m]+" ");
			}
			//check if new_temp have virus sequence
			final int VIRUS_LENGTH = fileContent.length - SIZE_OF_SEQUENCE;
			int countToCheck = 0;
			System.out.println("\nHFT : ");
			for(int m=0;m<VIRUS_LENGTH;m++)
			{
				countToCheck = 0;
				for(int n=0;n<SIZE_OF_SEQUENCE;n++)
				{
					// if u want to assign a value higher than 127 to a byte it overflows, 
					// so 128 as a byte in java is -128, 
					// but after you AND (&) -128 against 255 you'll get +128.
					if( ((byte)fileContent[(m+n)] & 255) == VIRUS_ARR[n])
					{
						countToCheck++;
						System.out.println("Now found : "+(fileContent[(m+n)]& 255)+" with count : "+countToCheck);
					}
					else
					{
						break;
					}
				}
				if(countToCheck == SIZE_OF_SEQUENCE)
				{
					System.out.println("This file has Virus !");
					//break;
				}
			}
			System.out.println("last countToCheck : "+countToCheck);
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
