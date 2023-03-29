/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Class for creating Sphere object
 */

public class Sphere extends ThreeDimensionalShape {

    private final double PI = 3.14;
    private double radius;

    public Sphere(double inRadius){
        dimensions = new NumberOfDimensions(3);
	    radius = inRadius;
	    setVolume();
    }

    @Override
        double calculateVolume(){
        //Sphere formula: 4/3(Pi * r^3)
	    return (PI * radius * radius * radius) * 4/3;
    }
    
}
