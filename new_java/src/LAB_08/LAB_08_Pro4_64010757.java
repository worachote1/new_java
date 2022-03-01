package LAB_08;

public class LAB_08_Pro4_64010757 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon oc1 = new Octagon(5) , oc2 ;
		System.out.println("Area : "+oc1.getArea()+" "+"Perimeter : "+oc1.getPerimeter());
		
		oc2 = (Octagon)oc1.clone();
		
		System.out.println("test oc2.getArea() ->"+oc2.getArea());
		
		if(oc1.compareTo(oc2) == 1)
		{
			System.out.println("Areas is equal");
		}
		else
		{
			System.out.println("Areas is not equal");
		}
	}

}
