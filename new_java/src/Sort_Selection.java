
public class Sort_Selection {

	public static void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (i == 0)
				System.out.print("{");
			if (i != a.length - 1)
				System.out.print(a[i] + ", ");
			if (i == a.length - 1)
				System.out.print(a[i] + "}");
		}
	}

	public static void selection_sort(int a[]) {
		
		for(int i=0;i<a.length;i++)
		{
			int min_index = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min_index])
				{
					min_index = j;
				}
			}
			int t = a[i];
			a[i] = a[min_index];
			a[min_index]=t;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 4, 5, 69, 12, 2, 11, 9 };
		selection_sort(arr);
		display(arr);
	}
	
	
}
