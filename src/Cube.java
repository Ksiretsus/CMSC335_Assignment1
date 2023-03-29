/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Class for creating Cubeobject
 */

public class Cube extends ThreeDimensionalShape {

    private double sideLength;

    public Cube(double inSideLength){
        dimensions = new NumberOfDimensions(3);
	    sideLength = inSideLength;
	    setVolume();
    }

    @Override
    double calculateVolume(){
        //Cube formula: side^3
	    return (sideLength * sideLength * sideLength);
    }
    
}
