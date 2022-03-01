package LAB_08;

import java.util.Date;

abstract class GeometricObject {
	private String color = null;
	private Boolean filled = false;
	private Date dateCreated;
	
	protected GeometricObject()
	{
		 this.dateCreated = new Date();
	}
	protected GeometricObject(String color,boolean filled)
	{
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	
	public String getColor()
	{
		return this.color;
	}
	void setColor(String color)
	{
		this.color = color;
	}
	
	public Boolean isFilled()
	{
		return this.filled;
	}
	public void setFilled(Boolean filled)
	{
		this.filled = filled;
	}
	
	public Date getDateCreate()
	{
		return dateCreated;
	}
	
	@Override
	public String toString() {
		
		return "GeometricObject{ color = " + this.color +
                " , filled = " + this.filled +
                " , dateCreated = " + this.dateCreated + "} ";
	}
	
	public abstract double getArea();
	public abstract double getPerimeter(); 
}
