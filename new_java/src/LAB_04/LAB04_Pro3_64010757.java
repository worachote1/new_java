package LAB_04;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class LAB04_Pro3_64010757 {

	//All method about sort list 
	public static void displayArr(double n[])
	{
		for(int i=0;i<n.length;i++)
		{
			System.out.print("\t");
			if(i%5==0 && i != 0)
			{
				System.out.println();
				System.out.print("\t");
			}
			System.out.print(n[i]+"\t");
		}
	}
	public static void displaySortArray(double n[])
	{
		System.out.println("Creating a list containing 1000 elements,");
		displayArr(n);
		System.out.println("\nList created.");
		
		Stopwatch StopWatch = new Stopwatch();
		System.out.println("Sorting stopwatch starts...");
		StopWatch.start();
		//sort by selection sort
		sort_selection(n);
		StopWatch.stop();
		//dislay after selection sort
		displayArr(n);
		System.out.println("\nSorting stopwatch stoped.\n"
				+ "The sort time is "+String.format("%.1f",StopWatch.getElapsedTime()) +" milliseconds.");
	}
	public static double[] sort_selection(double n[])
	{
		for(int i=0;i<n.length;i++)
		{
			int min_index = i;
			for(int j=i+1;j<n.length;j++)
			{
				if(n[min_index]>n[j])
				{
					min_index = j;
				}
			}
			double temp = n[min_index];
			n[min_index] = n[i];
			n[i] = temp;
		}
		return n;
	}
	
	//All method about palindrome
	public static void displayPal()
	{
		int count = 0,n=2;
		System.out.println("The palindromPrime stopwatch starts...\r\n"
				+ "Creating 1000 PalindromPrime...");
		Stopwatch StopWatch = new Stopwatch();
		StopWatch.start();
		while(count != 100)
		{
			boolean isPrime = true;
			//check prime	
			for(int i=2;i<=n-1;i++)
				{
				    if(n%i==0)
					{
						//not prime
						isPrime=false; break;
					}
				}
			//check Palindrome
			int num = n,reversedNum = 0, remainder=0;
			   while (num != 0) 
			   {
				      remainder = num % 10;
				      reversedNum = reversedNum * 10 + remainder;
				      num /= 10;
				}
			  //display only palindromic prime numbers. 10 number per each line
			  if(reversedNum==n && (isPrime)) 
			  {
				  count++; System.out.print(n+" "); if(count%10==0) System.out.println();
			  }  
			  n++;
		}
		StopWatch.stop();
		System.out.println("PalindromePrime created.\r\n"
				+ "The palindromPrime stopwatch stoped.\r\n"
				+ "The palindromPrime time is "
				+ String.format("%.1f",StopWatch.getElapsedTime())+ " milliseconds.");
		
	}
	public static void main(String[] args) {
		
		//Stopwatch StopWatch = new Stopwatch();
		Random rd = new Random();
		DecimalFormat df = new DecimalFormat("#.##");
		double n[] = new double [1000];
		for(int i=0;i<n.length;i++)
		{
			double num = rd.nextDouble(1000);
			n[i] = Double.parseDouble(df.format(num));
		}
		
		
		//measures the execution time of sorting 1,000 numbers using selection sort
		//then display
		displaySortArray(n);
		System.out.println("------------------------------------------------------------");
		//measures the executing time of creating 1,000 palindrome prime numbers.
		displayPal();
		
	 }
}

