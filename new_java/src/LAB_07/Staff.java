package LAB_07;

public class Staff extends Employee{
	public String title;
	
	Staff()
	{
		
	}
	
    @Override
    public String toString() {
        return super.toString()+"Staff{title=" + this.title+"} ";
    }
}
