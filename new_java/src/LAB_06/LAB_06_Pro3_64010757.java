package LAB_06;

import java.util.Arrays;

public class LAB_06_Pro3_64010757 {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		for(int i=1;i<=20;i++)
		{
			q.enqueue(i);
		}
		//System.out.println(q.element.length);
		while(! (q.empty()) )
		{
			System.out.print(" "+q.dequeue());
		}
		//System.out.println(q.element.length);
	}
}
