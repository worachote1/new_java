package LAB_08;

//in <> is the type of objects that this object may be compared to
public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
	
    private double width;
    private double height;

   
    public Rectangle() 
    {
        super();
    }

    public Rectangle(double width, double height) 
    {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) 
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public int compareTo(Rectangle o) {
    	if(this.getArea() == o.getArea())
    	{
    		return 1;
    	}
    	return 0;
    }
    
    @Override
    public boolean equals(Object obj) {
    	boolean check;
    	return check = (compareTo((Rectangle)obj) == 1) ? true : false;
    }
    
}
