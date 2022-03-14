package EPT_ET_13;

import java.util.Arrays;

public class RecentlyUsed {
	private int n = 0;
	private String a[];
	RecentlyUsed(int n) 
	{
		this.n = n;
		a = new String[n];
	}
	RecentlyUsed(String a[]) 
	{
		this.n = a.length;
		this.a = a ;
	}
	public void add(String s)
	{
		Boolean haveDuplicated = false;
		if(a[0]!=s)
		{
			int temp_index=-1;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==s)
				{
					haveDuplicated = true;
					temp_index = i;
					break;
				}
			}
			if(!(haveDuplicated))
			{
				for(int i=a.length-1;i>0;i--)
				{
					a[i]=a[i-1];
				}
				a[0]=s;
			}
			else //haveDuplicated
			{
				String temp = a[0];
				a[0]=a[temp_index];
				a[1]=temp;
//				for(int i=1;i<a.length;i++)
//				{
//					temp = a[i];
//					
//				}
			}
		}
	}
	public String get(int k)
	{
		return a[k];
	}
	public String[] toArra()
	{
		return a;
	}
	public String toString()
	{
		return Arrays.toString(a);
	}
}
