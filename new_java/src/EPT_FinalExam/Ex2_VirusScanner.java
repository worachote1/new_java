package EPT_FinalExam;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2_VirusScanner {

	// "D:/test_virus.dll"
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("D:/test_virus.dll"));
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(fis,"UTF8")
			);
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
			//store in temp
			int temp[] = new int[1000];
			int i = 0;
			//read one byte at a time
			System.out.println("\nread one byte at a time : ");
			while((ch = reader.read()) != -1)
			{
				//System.out.print((char)ch+" ");
				count++;
				System.out.print(ch+" ");
				temp[i++]=ch;
			}
			//System.out.println(0xA);
			System.out.println();
			System.out.println("All number in binary file : "+count);
			
			//creat new temp array which have length = count
			int new_temp[] = new int[count];
			for(int m=0;m<new_temp.length;m++)
			{
				new_temp[m]=temp[m];
			}				
			System.out.println("Display new_temp : ");
			for(int m=0;m<new_temp.length;m++)
			{
				System.out.print(new_temp[m]+" ");
			}
			//check if new_temp have virus sequence
			final int VIRUS_LENGTH = new_temp.length - SIZE_OF_SEQUENCE;
			int countToCheck = 0;
			System.out.println("\nHFT : ");
			for(int m=0;m<VIRUS_LENGTH;m++)
			{
				countToCheck = 0;
				for(int n=0;n<SIZE_OF_SEQUENCE;n++)
				{
					if(new_temp[(m+n)] == VIRUS_ARR[n])
					{
						countToCheck++;
						System.out.println("Now found : "+new_temp[(m+n)]+" with count : "+countToCheck);
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
