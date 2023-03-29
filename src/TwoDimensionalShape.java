/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Parent class for two dimensional
 * objects
 */

abstract class TwoDimensionalShape extends Shape {

    private double area;

    abstract double calculateArea();
    
    void setArea(){
	area = calculateArea();
    }

    public double getArea(){return area;}

}
