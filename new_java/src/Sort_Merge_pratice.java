
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
	
	public static void merge_sort(int arr[],int left, int right)
	{
		if(left==right) return;
		
		
		else
		{
			if(left<right)
			{
				int mid = (left+right)/2;
				merge_sort(arr, left, mid);
				merge_sort(arr, mid+1, right);
			
				//Merge 
				//for comparison , sorting and merging	
				
				//temp arrays
				int temp[] = new int[arr.length];  		
				//index of temp arrays
				int temp_index = left; 
				//left-sub arrays starter index
				int left_index = left;
				//right-sub arrays starter index
				int right_index = mid+1;
				
				//merge the left and right subarrays
				while(left_index<=mid && right_index<=right)
				{
					if(arr[left_index]<arr[right_index])
					{
						temp[temp_index++]=arr[left_index++];
						//temp_index++;
						//left_index++;
					}
					else if(arr[right_index]<arr[left_index])
					{
						temp[temp_index++]=arr[right_index++];
					//	temp_index++;
					//	right_index++;
					}
				}
				
				//merge for remaining either sub-left or sub-right
				while(left_index<=mid)
				{
					
						temp[temp_index++]=arr[left_index++];
			//			temp_index++;
			//			left_index++;
				}
				while(right_index<=right)
				{
					
						temp[temp_index++]=arr[right_index++];
			//			temp_index++;
			//			right_index++;
										
				}
			
				//Finally , clone temp into arr
				for(int i=left;i<=right;i++)
				{
					arr[i]=temp[i];
				}
				//test display arr at each time
				System.out.println("prn temp ");
				display(temp);				
				System.out.println("prn arr ");
				display(arr);
			}
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