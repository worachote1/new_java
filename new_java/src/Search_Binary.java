
public class Search_Binary {

	public static void search_binary(int arr[], int Low, int Hight) {

	}

	// display
	public static void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (i == 0)
				System.out.print("{");
			if (i != a.length - 1)
				System.out.print(a[i] + ", ");
			if (i == a.length - 1)
				System.out.println(a[i] + "}");
		}
	}

	// sort
	public static void sort(int a[], int length) {
		if (length == 1)
			return;

		for (int j = 0; j < a.length - 1; j++) {
			if (a[j + 1] < a[j]) {
				int t = a[j + 1];
				a[j + 1] = a[j];
				a[j] = t;
			}
		}
		length--;
		sort(a, length);
	}

	// Binary search
	// if target < mid --> right = mid -1
	// if target > mid --> left = mid + 1
	public static int binary_search(int a[],int target,int left, int right)
	{

			int mid = (left+right)/2; 
			if(target==a[mid]) return mid;	
			
			else { 
				if(target<a[mid]) 
				{
					return binary_search(a, target, left, mid-1);
				}
	
				else return binary_search(a, target, mid+1, right);		
			}
	}
		
	public static void main(String[] args) {
		System.out.println("Hello World");

		int arr[] = { 6, 4, 5, 69, 12, 2, 11, 9 };

		// I wanted to find index of 2;
		// first sorted element before search
		sort(arr, arr.length);

		// display
		display(arr);

		// Use binary search
		System.out.println(binary_search(arr, 11, 0, arr.length-1));
	}

}
