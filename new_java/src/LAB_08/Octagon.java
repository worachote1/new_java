package LAB_08;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

   private double side;
	Octagon() 
   {
		super();
   }
	Octagon(double side)
	{
		super();
		this.side = side;
	}
	
   
	@Override
    public double getPerimeter() {
        return 8 * this.side;
    }

    @Override
    public double getArea() {
    	//2 × s2 × (1+√2)
        return 2 * (1 + Math.sqrt(2)) * this.side * this.side;
    }
    
    @Override
    public int compareTo(Octagon o) {
    	if(this.getArea() == o.getArea())
    	{
    		return 1;
    	}
    	return 0;
    }

    @Override
    	public Object clone() throws CloneNotSupportedException{
    		
    		return super.clone();
    	}
}
