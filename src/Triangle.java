public class Triangle extends TwoDimensionalShape {

    private double base;
    private double height;

    public Triangle(double inBase, double inHeight){
	base = inBase;
	height = inHeight;
	setArea();
    }

    @Override
    double calculateArea(){
	return base * height * 1/2;
    }
    
}
