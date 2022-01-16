
public class  Sort_Merge_pratice {

	
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

	public static void merge(int arr[],int left,int mid,int right)
	{
		//Merge 
		//for comparison , sorting and merging 
		
		//temp arrays
		int temp[] = new int[arr.length];
		//index of temp arrays
		int k=left;
		
		//left-sub arrays starter index
		int left_index = left; 
		//right-sub arrays starter index
		int right_index = mid+1; 
		
		while(left_index <= mid && right_index <= right)
		{
			if(arr[left_index]<arr[right_index])
			{
				temp[k] = arr[left_index];
				k++;
				left_index++; 
			}
			else if(arr[right_index]<arr[left_index])
			{
				temp[k] = arr[right_index];
				k++;
				right_index++;
			}
		}
		
		//merge the remaining sub-left arrays
		while(left_index <= mid)
		{
			temp[k] = arr[left_index];
			k++;
			left_index++;
		}
		//merge the remain sub-right arrays
		while(right_index <= right)
		{
			temp[k] = arr[right_index];
			k++;
			right_index++;
		}
		
		//clone temp arrays into arr
		for(int m=left;m<=right;m++)
		{
			arr[m]=temp[m];
		}
	}		
	
	public static void merge_sort(int arr[],int left, int right)
	{
		int mid = (left+right)/2;
		
		if (left==right) return;
		
		else if(left<right) 
		{	
			merge_sort(arr, left, mid);
			merge_sort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 6, 4, 5, 69, 12, 2, 11, 9 };
		System.out.println("Before use Merge sort : ");
		display(arr);
		
		//After using Merge sort
		merge_sort(arr, 0, arr.length-1);
		
		System.out.println("After use Merge sort : ");
		display(arr);
			
	}
}