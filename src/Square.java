public class Square extends TwoDimensionalShape {

    private double sideLength;

    public Square(double inSide){
	sideLength = inSide;
	setArea();
    }

    @Override
    double calculateArea(){
	return sideLength * sideLength;
    }
    
}
