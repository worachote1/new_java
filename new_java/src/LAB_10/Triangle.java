package LAB_10;

public class Triangle {
	
	private double side[];
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	Triangle(double s[]) throws IllegalTriangleException
	{
		this.side = s;
		//sort
		for(int i=0;i<side.length;i++)
		{
			for(int j=0;j<side.length-1;j++)
			{
				if(side[j]>side[j+1])
				{
					double temp = side[j];
					side[j] = side[j+1];
					side[j+1] = temp;
				}
			}
		}
		
		String ss = (side[0]+side[1] > side[2]) ? "It's Triangle" : "Not a Triangle" ;
		if(ss.equals("Not a Triangle"))
		{
			//System.out.println("test");
			throw new IllegalTriangleException(ss);
		}
		else
		{
			System.out.println(ss);
		}
	}
}
