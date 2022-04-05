package LAB_10;

public class IllegalTriangleException extends Exception {

	public IllegalTriangleException()
	{
		
	}
    public IllegalTriangleException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}
