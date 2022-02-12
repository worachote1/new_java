package EPT_FinalExam;

import java.util.Scanner;

public class Ex1_Hanoi_Tower {

	public static final void TOH(int n,int []count,String source,String dest,String aux)
	{
		if(n==0)
		{
			return ;
		}
		TOH(n-1,count,source,aux,dest);
		System.out.println("move disk"+n+" from "+source+" to "+dest); count[0]++;
		TOH(n-1,count,aux,dest,source);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result,n,count[]= {0};
		// 3 rods to use
		String source = "source_rod",dest="dest_rod",aux="aux_rod";
		System.out.println("How many disk :");
		n = sc.nextInt();
		
		TOH(n,count,source, dest, aux);
		System.out.println("The minimum of move required : "+count[0]);
	}
}
