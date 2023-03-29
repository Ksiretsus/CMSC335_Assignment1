public class Circle extends TwoDimensionalShape {

    private final double PI = 3.14;
    private double radius;

    public Circle(double inRadius){
	radius = inRadius;
	setArea();
    }

    @Override
    double calculateArea(){
	return PI * radius * radius;
    }
    
}
