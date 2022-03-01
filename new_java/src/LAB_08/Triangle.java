package LAB_08;

public class Triangle extends GeometricObject{
	
	private double side[] = new double[3];
	public Triangle(String color,boolean filled,double Allside[]) 
	{	
	
		//Call super class constructor
		super(color,filled);
		
		for(int i=0;i<Allside.length;i++)
		{
			this.side[i]=Allside[i];
		}
	}
	
	
	public double getArea() {
	    double s = (side[0] + side[1] + side[2]) / 2;
        return Math.sqrt(s * (s-side[0]) * (s-side[1]) * (s-side[2]));
	}
	public double getPerimeter() {
		double sum =0;
		for(int i=0;i<this.side.length;i++)
		{
			sum += side[i];
		}
		return sum;
	}
	
	@Override
	 public String toString() {
		 return super.toString() 
				 + "\nTriangle {"
				 + " Area = " + getArea() 
				 + " Perimeter = " + getPerimeter()				
				 +" }";
	}
}
