
public class Pro2_64010757 {

	public static void main(String[] args) {

		double a[][] = 
			{ 
					{ 3.4, 50.2 }, 
					{ 2.1, 0.55 } 
			};

		double r[] = { 44.5, 5.9 };
		double det = a[0][0]*a[1][1] - a[1][0]*a[0][1];
		double x = (r[0]*a[1][1] - r[1]*a[0][1])  /  det;
		double y = (a[0][0]*r[1] - a[1][0]*r[0])  / det;
		
		System.out.println(x);
		System.out.println(y);
	}

}
