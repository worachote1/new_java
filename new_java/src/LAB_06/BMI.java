package LAB_06;

public class BMI {
	 // Attributes
    public String name;
    public int age;
    public double weight;
    public double feet;
    public double inches;

    // Constructors
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    // Methods
    public double getBMI() {
      
        double h = 12 * feet + inches;
        return (weight * 0.45359237) / ((h * 0.0254) * (h * 0.0254));
    }

    public void display() 
    {
    	//double bmi = getBMI();
        if (getBMI() < 18.5) 
        	{
        		System.out.println(getBMI()+" Underweight");
        	}
         else if (getBMI() < 25)
        	 {
        	 	System.out.println(getBMI()+" Normal");
        	 }
         else if (getBMI() < 30)
        	 {
        	 	System.out.println(getBMI()+" Overweight"); 
        	 }
         else 
         	{
        	 	System.out.println(getBMI()+" Obese");
         	}
    }
}