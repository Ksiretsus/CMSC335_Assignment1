/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Class for creating Circle object
 */

public class Circle extends TwoDimensionalShape {

    private final double PI = 3.14;
    private double radius;

    public Circle(double inRadius){
        dimensions = new NumberOfDimensions(2);
	    radius = inRadius;
	    setArea();
    }

    @Override
    double calculateArea(){
	    return PI * radius * radius;
    }
    
}
