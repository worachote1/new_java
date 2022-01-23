package LAB_03;

public class Lab03_Pro1_64010757 {

	public static void main(String[] args) {
		//find the first 100 palindromic prime numbers.
		int count = 0,n=2;
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
	}
}
