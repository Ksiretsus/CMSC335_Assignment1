public class Cylinder extends ThreeDimensionalShape {

    private final double PI = 3.14;
    private double radius;
    private double height;

    public Cylinder(double inRadius, double inHeight){
	radius = inRadius;
	height = inHeight;
	setVolume();
    }

    @Override
    double calculateVolume(){
	//Cylinder formula: (Pi * radius^2 * height)
	return (PI * radius * radius * height);
    }
    
}
