package LAB_08;

public class Square extends GeometricObject implements Colorable{
    private double side;

    // Constructors
    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    // Methods
    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public void howToColor() {
        if (super.isFilled()) {
            System.out.println("All sides's colour is " + super.getColor());
        } else {
            System.out.println("Square isn't filled");
        }
    }
}
