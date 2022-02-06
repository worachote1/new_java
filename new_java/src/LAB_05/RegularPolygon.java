package LAB_05;

public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	
	//Default Constructor
	RegularPolygon() 
	{
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
	
	RegularPolygon(int side,double lengthOfSide)
	{
		this.n = side;
		this.side = lengthOfSide;
		//centered at (0, 0)
		this.x=0; this.y=0;
	}
	RegularPolygon(int side,double lengthOfSide,double x,double y)
	{
		this.n = side;
		this.side = lengthOfSide;
		
		this.x=x; this.y=y;
	}
	
	//Mutate
	public void setSide(int n)
	{
		this.n = n;
	}
	public void setLengthOFSide(double side)
	{
		this.side = side;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	
	//Access
	public int getSide()
	{
		return n;
	}
	public double getLengthOFSide()
	{
		return side;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	
	//find Perimeter
	public double getPerimeter()
	{
		return n*side;
	}
	
	//find Area
	public double getArea()
	{
		return n*Math.pow(side, 2)/(4*Math.tan(Math.PI/n));
	}
}
