
public class Sort_Bubble {

	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(i==0) System.out.print("{");
			if(i != a.length-1)System.out.print(a[i]+", ");
			if(i == a.length-1) System.out.print(a[i]+"}");
		}
	}
	public static void bubble_sort(int a[],int length)
	{
		if(length == 0) return;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int t = a[i+1];
				a[i+1] = a[i];
				a[i] = t;
			}
		}
		bubble_sort(a, length-1);;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {6, 4, 5, 69,12, 2, 11, 9}; 
		 bubble_sort(arr, arr.length);
		 display(arr); 
	}
 
}
