package LAB_05;

public class LAB_05_Pro2_64010757 {
	public static void displayPerimeterAndArea(RegularPolygon r[],int num)
	{
		int i = 3-num;
		if(num > 0)
		{
			System.out.println(r[i].getPerimeter()+" "+r[i].getArea());
			num -= 1;
			displayPerimeterAndArea(r, num);
		}
		return;
		
	}
	public static void main(String[] args) {
		RegularPolygon r[] = new RegularPolygon[3];
		 r[0] = new RegularPolygon();
		 r[1] = new RegularPolygon(6,4);
		 r[2] = new RegularPolygon(10,4,5.6,7.8);
	
		 displayPerimeterAndArea(r, r.length);
		 
//		displayPerimeterAndArea(r1);
//		displayPerimeterAndArea(r2);
//		displayPerimeterAndArea(r3);
	}

}
