public class Cone extends ThreeDimensionalShape {

    private final double PI = 3.14;
    private double radius;
    private double height;

    public Cone(double inRadius, double inHeight){
	radius = inRadius;
	height = inHeight;
	setVolume();
    }

    @Override
    double calculateVolume(){
	//Cone formula: 1/3(Pi * radius^2 * height)
	return (PI * radius * radius * height)*1/3;
    }
    
}
