public class Rectangle extends TwoDimensionalShape {

    private double length;
    private double width;

    public Rectangle(double inLength, double inWidth){
	length = inLength;
	width = inWidth;
	setArea();
    }

    @Override
    double calculateArea(){
	return length * width;
    }
    
}
