/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Class for creating Triangle object
 */

public class Triangle extends TwoDimensionalShape {

    private double base;
    private double height;

    public Triangle(double inBase, double inHeight){
        dimensions = new NumberOfDimensions(2);
	    base = inBase;
	    height = inHeight;
	setArea();
    }

    @Override
    double calculateArea(){
	    return base * height * 1/2;
    }
    
}
