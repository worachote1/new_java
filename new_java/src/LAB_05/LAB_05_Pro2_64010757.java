package LAB_05;

public class LAB_05_Pro2_64010757 {
	public static void displayPerimeterAndArea(RegularPolygon r)
	{
		System.out.println(r.getPerimeter()+" "+r.getArea());
	}
	public static void main(String[] args) {
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6,4);
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
	
		displayPerimeterAndArea(r1);
		displayPerimeterAndArea(r2);
		displayPerimeterAndArea(r3);
	}

}
