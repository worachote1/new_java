package LAB_08;
import java.util.Scanner;
public class LAB_08_Pro2_64010757 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     
       Square s[] = new Square[5];
      for(int i=0;i<s.length;i++)
      {
    	  boolean filled;
    	  String color;
    	  double side;
    	  
    	  
    	  System.out.println("Enter color : ");
    	  color = sc.nextLine();
    	  
    	  System.out.println("Is filled or not ? : ");
    	  filled = sc.nextBoolean();
    	  color = (filled) ? color : null;
    	  
    	  System.out.println("Enter side : ");
    	  side = sc.nextDouble();
    	  sc.nextLine();
    	  
    	  s[i] = new Square(color, filled, side);
    	  
    	  System.out.println("Area = "+s[i].getArea());
    	  s[i].howToColor();
      }
       
       sc.close();
	}

}
