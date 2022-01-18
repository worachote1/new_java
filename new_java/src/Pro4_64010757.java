import java.util.Scanner;

public class Pro4_64010757 {

	public static double bmi(double w,double h)
	{
		w *= 0.45359237;
		h *= 0.0254;
		
		return w/Math.pow(h, 2);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = sc.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = sc.nextDouble();
		System.out.print("BMI is ");
		System.out.format("%.4f",bmi(weight, height));
	}

}
