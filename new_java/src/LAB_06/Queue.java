package LAB_06;

public class Queue {
	public int element[];
	private int temp[];
	private int size;
	
	
	public Queue() 
	{
		element = new int [8];
		size= 0;
	}
	public void enqueue(int v)
	{
		if(size>=element.length)
		{
			temp = new int[element.length*2];
			System.arraycopy(element, 0, temp, 0, element.length);
			element = temp;
		}
		element[size]=v;
		size++;
	}
	public int dequeue()
	{
		//remove from beginning then shift to left
		int remove_element = element[0];
		for(int i=0;i<element.length-1;i++)
		{
			element[i]=element[i+1];
		}
		size--;
		return remove_element;
	}
	public Boolean empty()
	{
		return (size == 0) ? true : false;
	}
	
	public int getSize()
	{
		return size;
	}
	
}
