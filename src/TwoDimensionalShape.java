abstract class TwoDimensionalShape extends Shape {

    private double area;

    abstract double calculateArea();
    
    void setArea(){
	area = calculateArea();
    }

    public double getArea(){return area;}

}
