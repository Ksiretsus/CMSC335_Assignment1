/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Parent class for three dimensional
 * objects
 */

abstract class ThreeDimensionalShape extends Shape {

    private double volume;

    abstract double calculateVolume();
    
    void setVolume(){
	volume = calculateVolume();
    }

    public double getVolume(){return volume;}

}
