import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_Merge {
	
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(i==0) System.out.print("{");
			if(i != a.length-1)System.out.print(a[i]+", ");
			if(i == a.length-1) System.out.print(a[i]+"}");
		}
	}
	 
	public static void merge(int arr[], int left, int mid, int right){

	    int len1 = mid - left +1;
	    int len2 = right - (mid+1)+1;
	    System.out.println("len1 = "+len1+"                              , len2 = "+len2);
	    int i;
	    int index1 = 0 , index2 = 0;
	    // create temp array
	    int left_array []= new int[len1];
	    int right_array[]= new int[len2];

	  //copy elements into left subarray
	    for(i=0;i<len1;i++){
	        left_array[i] = arr[left+i];
	    }
	    System.out.print("left_array = ");
	    System.out.print(Arrays.toString(left_array));
	  
	    //copy elements into right subarray
	    for(i=0;i<len2;i++){
	        right_array[i] = arr[mid+1+i];
	    }
	    System.out.print("             , right_array = ");
	    System.out.println(Arrays.toString(right_array));
	   
	    i=left;	//get starting index for sort
	   
	    
	    while(index1 < len1 && index2 < len2 ){                    //merge the left and right subarrays
	        if(left_array[index1] < right_array[index2]){        
	            arr[i] = left_array[index1];		  
	            System.out.println("a = "+arr[i]);     //  
	            index1++;
	        }
	        else {
	            arr[i] = right_array[index2];                     
	            System.out.println("b = "+arr[i]);  //
	            index2++;
	        }
	        i++;
	    }
	    // check for other one
	    while(index1 < len1){									//merge the remaining elements from the left subarrays
	        arr[i] = left_array[index1];
	        System.out.println("c = "+arr[i]); //
	        i++;  
	        index1++;
	        
	    }
	    while(index2 < len2){ 									//merge the remaining elements from right subarray
	        arr[i] = right_array[index2]; 
	        System.out.println("d = "+arr[i]);   //
	        i++;
	        index2++;
	    }

	}
	
	//split
	public static void merge_sort(int arr[],int left,int right)
	{
		int mid =( left + right ) / 2;
		
		if(left < right)
		{
			merge_sort(arr, left, mid);
			System.out.println("now merge_sort(arr, left, mid);");
			merge_sort(arr, mid+1, right);
			System.out.println("now merge_sort(arr, mid+1, right);");
			//merge
			merge(arr, left, mid, right);
			System.out.println("now merge(arr, left, mid, right);");
		}
	}
	
    public static void main(String args[])
    {
    	int arr[] = { 2, 8, 5, 3, 9, 4};
    	System.out.println("Hello World , prn ");
    	merge_sort(arr,0,arr.length-1);
    	display(arr);
    }
}


