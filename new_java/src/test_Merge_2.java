
public class test_Merge_2 {
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(i==0) System.out.print("{");
			if(i != a.length-1)System.out.print(a[i]+", ");
			if(i == a.length-1) System.out.print(a[i]+"}");
		}
	}
	
	public static void merge(int arr[],int mid,int left,int right)
	{
		int left_index = left	,right_index = mid+1;
		int temp_arr[] = new int [arr.length];
		int temp_index = left;
		
		while(left_index<=mid && right_index<=right)
		{
			if(arr[left_index]<arr[right_index])
			{
				temp_arr[temp_index]=arr[left_index];
				temp_index++;
				left_index++;
			}
			else if(arr[right_index]<arr[left_index])
			{
				temp_arr[temp_index]=arr[right_index];
				temp_index++;
				right_index++;
			}
		}
		
		while(left_index<=mid)
		{
			temp_arr[temp_index] = arr[left_index];
			temp_index++;
			left_index++;
		}
		while(right_index<=right)
		{
			temp_arr[temp_index] = arr[right_index];
			temp_index++;
			right_index++;			
		}
		
		//clone temp to array
		for(int i=left;i<=right;i++)
		{
			arr[i]=temp_arr[i];
		}
	}
	public static void merge_sort(int arr[],int left,int right)
	{
		if(left==right) return;
		
		else if(left<right)
		{
			int mid = (left+right)/2;
			merge_sort(arr, left, mid);
			merge_sort(arr, mid+1, right);
		
			//now compare,sort,merge
			merge(arr, mid, left, right);
			
		
		}
	}
	public static void main(String[] args) {
			
		 //Before Merge sort
		 int arr[] = {6, 4, 5, 79,12, 2, 11, 9}; 
		 display(arr); 
		 
		 //After Merge sort
		 System.out.println("\nAfter Merge sort");
		 merge_sort(arr, 0, arr.length-1);
		 display(arr);
	}

}
