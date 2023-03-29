/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Class for creating Rectangle object
 */

public class Rectangle extends TwoDimensionalShape {

    private double length;
    private double width;

    public Rectangle(double inLength, double inWidth){
        dimensions = new NumberOfDimensions(2);
	    length = inLength;
	    width = inWidth;
	    setArea();
    }

    @Override
    double calculateArea(){
	    return length * width;
    }
    
}
