public class Sphere extends ThreeDimensionalShape {

    private final double PI = 3.14;
    private double radius;

    public Sphere(double inRadius){
	radius = inRadius;
	setVolume();
    }

    @Override
    double calculateVolume(){
	return (PI * radius * radius * radius) * 4/3;
    }
    
}
