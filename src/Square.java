/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Class for creating Square object
 */

public class Square extends TwoDimensionalShape {

    private double sideLength;

    public Square(double inSide){
        dimensions = new NumberOfDimensions(2);
	    sideLength = inSide;
	    setArea();
    }

    @Override
    double calculateArea(){
        //Square formula: side^2
	    return sideLength * sideLength;
    }
    
}
