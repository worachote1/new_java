import java.util.Scanner;



public class Pro3_64010757 {
	
	public static int calDigit(int num)
	{
		if(!(num>0&&num<1000)) return -1;
		int sum = 0;
		while(num!=0) 
		{
			sum += num%10;
			num /= 10;
		}
			
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000 : ");
		int n = sc.nextInt();
		if(calDigit(n) != -1) System.out.println("The sum of the digits is "+calDigit(n));
	}

}
