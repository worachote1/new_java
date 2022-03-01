package LAB_08;

public class LAB_08_Pro3_64010757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5,5,"red",true);   //area = 25
		Rectangle r2 = new Rectangle(1,25,"blue",true); //area = 25
		Rectangle r3 = new Rectangle(4,4,"green",true); //area = 16
		
		if(r1.equals(r2))
		{
			System.out.println("Areas is equal");
		}
		else
		{
			System.out.println("Areas is not equal");
		}
		
		if(r1.equals(r3))
		{
			System.out.println("Areas is equal");
		}
		else
		{
			System.out.println("Areas is not equal");
		}
	}

}
